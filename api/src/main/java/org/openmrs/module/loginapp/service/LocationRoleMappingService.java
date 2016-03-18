package org.openmrs.module.loginapp.service;

import java.util.List;

import org.openmrs.Location;
import org.openmrs.module.loginapp.domain.LocationRoleMapping;


public interface LocationRoleMappingService {

	List<LocationRoleMapping> getAllLocationRoleMappings();

	Location getLocationByRole(String role);
	
	LocationRoleMapping saveLocationRoleMapping(LocationRoleMapping locationRole);

}
