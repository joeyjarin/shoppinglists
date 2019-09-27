package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.idfyed.assignment.shoppinglist.GroceryStock;

public class GroceryTest {

	@Test
	public void getFieldsTest() {
		Grocery apple = new Grocery("apple", GroceryCategory.fruit, Unit.pcs);

		Assert.assertEquals("apple", apple.getName());
		Assert.assertEquals(GroceryCategory.fruit, apple.getCategory());
		Assert.assertEquals("apple", apple.getName());
		Assert.assertEquals(GroceryStock.get("apple"), apple);

	}
}
