package org.openmrs.module.loginapp.service.impl;

import java.util.List;

import org.openmrs.Location;
import org.openmrs.module.loginapp.dao.LocationRoleMappingDAO;
import org.openmrs.module.loginapp.domain.LocationRoleMapping;
import org.openmrs.module.loginapp.service.LocationRoleMappingService;

public class LocationRoleMappingServiceImpl implements LocationRoleMappingService {

	private LocationRoleMappingDAO dao;
	
	public void setDao(LocationRoleMappingDAO dao) {
		this.dao = dao;
	}

	@Override
	public Location getLocationByRole(String role) {
		return dao.getLocationByRole(role);
	}

	@Override
	public LocationRoleMapping saveLocationRoleMapping(LocationRoleMapping locationRole) {
		return dao.saveLocationRoleMapping(locationRole);
	}

	@Override
	public List<LocationRoleMapping> getAllLocationRoleMappings() {
		return dao.getAllLocationRoleMappings();
	}

}
