package org.openmrs.module.loginapp.service.impl;

import java.util.List;

import org.openmrs.Location;
import org.openmrs.module.loginapp.dao.LocationRoleDAO;
import org.openmrs.module.loginapp.domain.LocationRole;
import org.openmrs.module.loginapp.service.LocationRoleService;

public class LocationRoleServiceImpl implements LocationRoleService {

	private LocationRoleDAO dao;

	@Override
	public Location getLocationByRole(String role) {
		return dao.getLocationByRole(role);
	}

	@Override
	public LocationRole saveLocationRoleMapping(LocationRole locationRole) {
		return dao.saveLocationRole(locationRole);
	}

	@Override
	public List<LocationRole> getAllLocationRoleMappings() {
		return dao.getAllLocationRoleMappings();
	}

}
