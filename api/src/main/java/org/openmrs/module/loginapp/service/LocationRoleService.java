package org.openmrs.module.loginapp.service;

import java.util.List;

import org.openmrs.Location;
import org.openmrs.module.loginapp.domain.LocationRole;


public interface LocationRoleService {

	List<LocationRole> getAllLocationRoleMappings();

	Location getLocationByRole(String role);
	
	LocationRole saveLocationRoleMapping(LocationRole locationRole);

}
