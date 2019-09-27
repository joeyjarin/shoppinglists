package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTest {

	@Test
	public void constructor() {
		Shop target = new Shop("acme", 43);

		Assert.assertEquals(target.getName(), "acme");
		Assert.assertEquals(target.getId(), 42);
	}
}
