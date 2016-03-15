package org.openmrs.module.loginapp.domain;

import org.openmrs.Location;
import org.openmrs.Role;

public class LocationRole {

	private Integer id;
	private Role role;
	private Location location;
	private Boolean preferred;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Boolean getPreferred() {
		return preferred;
	}

	public void setPreferred(Boolean preferred) {
		this.preferred = preferred;
	}

}
