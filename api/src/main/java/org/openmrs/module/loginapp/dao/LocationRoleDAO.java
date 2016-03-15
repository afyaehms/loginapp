package org.openmrs.module.loginapp.dao;

import java.util.List;

import org.openmrs.Location;
import org.openmrs.module.loginapp.domain.LocationRole;

public interface LocationRoleDAO {

	Location getLocationByRole(String role);

	LocationRole saveLocationRole(LocationRole locationRole);

	List<LocationRole> getAllLocationRoleMappings();

}
