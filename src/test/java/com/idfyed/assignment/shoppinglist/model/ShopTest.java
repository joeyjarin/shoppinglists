package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTest {

	@Test
	public void constructor() {
		int id = 43;
		String name = "acme";
		
		Shop target = new Shop(name, id);

		Assert.assertEquals(target.getName(), name);
		Assert.assertEquals(target.getId(), id);
	}
}
