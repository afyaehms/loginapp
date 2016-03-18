package org.openmrs.module.loginapp.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Location;
import org.openmrs.module.loginapp.dao.LocationRoleMappingDAO;
import org.openmrs.module.loginapp.domain.LocationRoleMapping;

public class HibernateLocationRoleMappingDAO implements LocationRoleMappingDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Location getLocationByRole(String role) {
		Criteria locationRoleMappingCriteria = sessionFactory.getCurrentSession().createCriteria(LocationRoleMapping.class);
		locationRoleMappingCriteria.add(Restrictions.like("roleName", role));
		List<LocationRoleMapping> locationRoleMappings = (List<LocationRoleMapping>) locationRoleMappingCriteria.list();
		if (locationRoleMappings.size() > 0) {
			Location location = null;
			for (LocationRoleMapping locationRole : locationRoleMappings) {
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
	public LocationRoleMapping saveLocationRoleMapping(LocationRoleMapping locationRole) {
		sessionFactory.getCurrentSession().saveOrUpdate(locationRole);
		return locationRole;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LocationRoleMapping> getAllLocationRoleMappings() {
		Criteria locationRoleCriteria = sessionFactory.getCurrentSession().createCriteria(LocationRoleMapping.class);
		return locationRoleCriteria.list();
	}

}
