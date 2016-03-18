package org.openmrs.module.loginapp.domain;

import org.openmrs.Location;
import org.springframework.util.Assert;

public class LocationRoleMapping {

	private Integer id;
	private String roleName;
	private Location location;
	private Boolean preferred;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		Assert.notNull(roleName, "role name must not be null");
		this.roleName = roleName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		Assert.notNull(location, "location must not be null");
		this.location = location;
	}

	public Boolean getPreferred() {
		return preferred;
	}

	public void setPreferred(Boolean preferred) {
		this.preferred = preferred;
	}

}
