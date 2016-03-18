package org.openmrs.module.loginapp.service;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openmrs.Location;
import org.openmrs.api.context.Context;
import org.openmrs.module.loginapp.domain.LocationRoleMapping;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public class LocationRoleMappingServiceTest extends BaseModuleContextSensitiveTest {

	@Test public void should_saveLocationRoleMapping() throws Exception {
		setup();
		LocationRoleMapping locationRoleMapping = new LocationRoleMapping();
		locationRoleMapping.setRoleName("General OPD Role");
		locationRoleMapping.setLocation(Context.getLocationService().getLocation(900));
		
		Assert.assertNull(locationRoleMapping.getId());
		locationRoleMapping = Context.getService(LocationRoleMappingService.class).saveLocationRoleMapping(locationRoleMapping);
		Assert.assertNotNull(locationRoleMapping.getId());
	}

	@Test public void should_getPreferredLocationIfMoreThanOneLocationIsMapped() throws Exception {
		executeDataSet("locationrolemappings.xml");
		Location location = Context.getService(LocationRoleMappingService.class).getLocationByRole("General OPD Role");
		
		Assert.assertThat(location.getId(), Matchers.is(901));
	}
	
	@Test public void should_getFirstLocationIfNoLocationIsPreferred() throws Exception {
		executeDataSet("locationrolemappings.xml");
		Location location = Context.getService(LocationRoleMappingService.class).getLocationByRole("Lab Role");
		
		Assert.assertThat(location.getId(), Matchers.is(902));
	}
	
	@Test public void should_getFirstLocationIfAllLocationArePreferred() throws Exception {
		executeDataSet("locationrolemappings.xml");
		Location location = Context.getService(LocationRoleMappingService.class).getLocationByRole("Pharm Role");
		
		Assert.assertThat(location.getId(), Matchers.is(904));
	}

	@Before public void setup() throws Exception {
		executeDataSet("roles.xml");
		executeDataSet("locations.xml");
	}
}
