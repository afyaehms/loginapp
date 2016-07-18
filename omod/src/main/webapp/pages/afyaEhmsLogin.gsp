<%
	ui.includeCss("loginapp", "offline.css")
	ui.includeCss("loginapp", "general.css")
	ui.includeCss("loginapp", "login.css")
	ui.includeCss("uicommons", "styleguide/jquery.toastmessage.css", Integer.MAX_VALUE - 20)
	
	ui.includeJavascript("uicommons", "jquery-1.8.3.min.js", Integer.MAX_VALUE)
	ui.includeJavascript("uicommons", "jquery-ui-1.9.2.custom.min.js", Integer.MAX_VALUE - 10)
	ui.includeJavascript("uicommons", "jquery.toastmessage.js", Integer.MAX_VALUE - 20)
%>

<html>
	<head>
		<title>Login</title>
		<link rel="shortcut icon" href="${ui.resourceLink('loginapp', 'images/favicon.ico')}">
		
		${ ui.resourceLinks() }
		
		<script>
			var jq = jQuery;
			var loginError;
			
			jq(function () {
				var styleSheets = document.styleSheets;
				console.log(styleSheets);
				
				for (var i = 0; i < styleSheets.length; i++) {
					if (styleSheets[i].href.indexOf("referenceapplication.css") >= 0){
						document.styleSheets[i].disabled = true;
						break;
					}
				}
				
				loginError = jq('#error-message').text();
				console.log(loginError);
			});
			
		</script>
		
		<style>
			#header{
				background: url("${ui.resourceLink('loginapp', 'images/banner.png')}") repeat-x scroll 0 0;
				height: 93px;
			}
			#header div{
				margin: auto;
				max-width: 1000px;
				text-align: left;
			}
			#header .breadcrumbs{
				background: url("${ui.resourceLink('loginapp', 'images/banner-right.png')}") no-repeat scroll 0 0;
				display: inline-block;
				float: right;
				height: 93px;
				width: 300px;
			}
			#header .breadcrumbs .clr{
				background: url("${ui.resourceLink('loginapp', 'images/banner-right-leaf.png')}") repeat-x scroll 0 0;
				display: inline-block;
				float: right;
				height: 93px;
				width: 250px;
			}
			.body{
				margin: auto;
				max-width: 1000px;
				text-align: left;
			}
			.body .welcome{
				display: inline-block;
				padding: 30px 0 0 10px;
				width: 60%;
			}
			.body .login-div{
				border-top: 20px solid #3b9dd5;
				float: right;
				height: 400px;
				margin: 20px 10px 0 0;
				width: 360px;
			}			
			.login-div .login-border{
				background: #fcfcfc none repeat scroll 0 0;
				border-bottom: 2px solid #efefef;
				border-left: 2px solid #efefef;
				border-right: 2px solid #efefef;
				height: 100%;
				padding: 15px 30px;
				
			}
			.login-form-title{
				font-size: 22px;
				font-weight: bold;
			}
			.login-form-descr{
				font-size: 13px;
				margin: 20px 0 30px 0;
			}
			.footer-div{
				background: url("${ui.resourceLink('loginapp', 'images/footer.png')}") repeat scroll 0 0;
				position: fixed;
				bottom: 0;
				width: 100%;
			}
			.footer-div div{
				color: #fff;
				font-size: 12px;
				font-weight: bold;
				text-align: left;
				padding: 5px;
				margin: auto;
				max-width: 1000px;
			}
			.footer-div span{
				color: #fff;
				float: right;
				font-size: 12px;
			}
		</style>

		
	</head>
	
	<body>
		<div id="header">
			<div class="logo">
				<img src="${ui.resourceLink('loginapp', 'images/afyalogo-white.png')}"/>
				
				<div class="breadcrumbs">
					<div class="clr">
					</div>				
				</div>
			</div>
		</div>

		<div style="display: none;">
			${ ui.includeFragment("referenceapplication", "infoAndErrorMessages") }
		</div>
		
		<div class="body">
			<div class="welcome">
				<img src="${ui.resourceLink('loginapp', 'images/welcome-mockup.png')}" />
			</div>
			
			<div class="login-div">
				<div class="login-border">				
					<div class="login-form-title">Access the Afya EHMS</div>
					<div class="login-form-descr">Please enter the username and password provided by your administrator.</div>
					
					<form id="form-login" method="post">
						<fieldset class="input">
							<p id="form-login-username">
								<label for="username">User Name</label>
								<input type="text" size="18" alt="User Name" class="inputbox" id="username" name="username">
							</p>
							
							<p id="form-login-password">
								<label for="password">Password</label>
								<input type="password" id="password" alt="Password" size="18" class="inputbox" name="password">
							</p>
							
							<p id="form-submit">								
								<input type="submit" class="button" name="Submit" value="Log in">
							</p>							
						</fieldset>
					</form>
					
					<div class="login-form-descr" style="margin: 20px 0 30px 3px; color: #555;">Click <a href="#">here</a> if you have forgotten your username or password.</div>
				</div>
				
			</div>
		</div>
		
		<div class="footer-div">
			<div>
				Copyright &copy; 2016, Republic of Kenya, Ministry of Health
				<span>Powered by OpenMRS</span>
			</div>
		</div>
  </body>
</html>
