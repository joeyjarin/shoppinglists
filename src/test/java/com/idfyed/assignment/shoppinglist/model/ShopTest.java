package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTest {

	@Test
	public void getFieldsTest() {
		Shop target = new Shop("acme", 43);

		Assert.assertEquals(target.getName(), "acme");
		Assert.assertEquals(target.getId(), 43);
	}
	
	@Test
	public void getDefaultIdTest() {
		Shop target = new Shop("acme");

		Assert.assertEquals(target.getName(), "acme");
		Assert.assertEquals(target.getId(), 42);
	}
}
