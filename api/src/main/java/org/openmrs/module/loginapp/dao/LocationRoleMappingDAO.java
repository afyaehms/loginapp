package org.openmrs.module.loginapp.dao;

import java.util.List;

import org.openmrs.Location;
import org.openmrs.module.loginapp.domain.LocationRoleMapping;

public interface LocationRoleMappingDAO {

	Location getLocationByRole(String role);

	LocationRoleMapping saveLocationRoleMapping(LocationRoleMapping locationRole);

	List<LocationRoleMapping> getAllLocationRoleMappings();

}
