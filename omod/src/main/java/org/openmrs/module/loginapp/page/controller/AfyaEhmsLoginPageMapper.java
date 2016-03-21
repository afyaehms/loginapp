package org.openmrs.module.loginapp.page.controller;

import org.openmrs.ui.framework.page.PageRequest;
import org.openmrs.ui.framework.page.PageRequestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AfyaEhmsLoginPageMapper implements PageRequestMapper {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	public boolean mapRequest(PageRequest request) {
		if (request.getProviderName().equals("referenceapplication")) {
			if( request.getPageName().equals("login")) {
				log.info("Remapping request to referenceapplication login page to afyaehms login page");
				request.setProviderNameOverride("loginapp");
				request.setPageNameOverride("afyaEhmsLogin");
			}
		}
		return true;
	}
}