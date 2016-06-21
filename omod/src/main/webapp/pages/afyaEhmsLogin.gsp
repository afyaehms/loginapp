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
			
			jq(function () {
				var styleSheets = document.styleSheets;
				console.log(styleSheets);
				
				for (var i = 0; i < styleSheets.length; i++) {
					if (styleSheets[i].href.indexOf("referenceapplication.css") >= 0){
						document.styleSheets[i].disabled = true;
						break;
					}
				}
			});
			
		</script>

		
	</head>
	
	<body>

	${ ui.includeFragment("referenceapplication", "infoAndErrorMessages") }

		<div class="outline" id="frame">
			<h1>Afya EHMS</h1>
			
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
					
					<p id="form-login-remember">
						<label for="remember">&nbsp;</label>
						<input type="checkbox" id="remember" alt="Remember me" value="yes" class="inputbox" name="remember">
						<span style="padding-left:5px; padding-top:2px; color:#666666; font-weight:bold;">Remember me</span>
					</p>
					
					<p id="form-submit">
						<label for="give"><span style="color:#FFF">&nbsp;</span></label>
						<input type="submit" class="button" name="Submit" value="Login">
					</p>
				</fieldset>
			</form>
		</div>
		
		<div id="sbox-overlay" aria-hidden="true" style="z-index: 65555; opacity: 0;" tabindex="-1">
		</div>

		<div id="sbox-window" role="dialog" aria-hidden="true" style="z-index: 65557;" class="shadow">
			<div id="sbox-content" style="opacity: 0;"></div>
			<a id="sbox-btn-close" href="#" role="button" aria-controls="sbox-window">
			</a>
	   </div>
  </body>
</html>
