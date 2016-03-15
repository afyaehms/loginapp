package org.openmrs.module.loginapp.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Location;
import org.openmrs.module.loginapp.dao.LocationRoleDAO;
import org.openmrs.module.loginapp.domain.LocationRole;

public class HibernateLocationRoleDAO implements LocationRoleDAO {

	private SessionFactory session;

	@SuppressWarnings("unchecked")
	@Override
	public Location getLocationByRole(String role) {
		Criteria locationRoleCriteria = session.getCurrentSession().createCriteria(LocationRole.class);
		locationRoleCriteria.add(Restrictions.eq("role", role));
		List<LocationRole> locationRoleMappings = (List<LocationRole>) locationRoleCriteria.list();
		if (locationRoleMappings.size() > 0) {
			Location location = null;
			for (LocationRole locationRole : locationRoleMappings) {
				if (locationRole.getPreferred()) {
					location = locationRole.getLocation();
					break;
				}
			}
			if (location == null) {
				location = locationRoleMappings.get(0).getLocation();
			}
			return location;
		}
		return null;
	}

	@Override
	public LocationRole saveLocationRole(LocationRole locationRole) {
		session.getCurrentSession().saveOrUpdate(locationRole);
		return locationRole;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LocationRole> getAllLocationRoleMappings() {
		Criteria locationRoleCriteria = session.getCurrentSession().createCriteria(LocationRole.class);
		return locationRoleCriteria.list();
	}

}
