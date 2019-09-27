package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.idfyed.assignment.shoppinglist.GroceryStock;


public class GroceryTest {

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "unknown conversion: cl -> pcs")
	public void getConverterTest() {
		Grocery apple = new Grocery("apple", GroceryCategory.fruit, Unit.pcs);

		apple.getConverter(Unit.cl, Unit.pcs);
	}

	@Test
	public void getNameTest() {
		Grocery apple = new Grocery("apple", GroceryCategory.fruit, Unit.pcs);

		Assert.assertEquals("apple", apple.getName());
		Assert.assertEquals(GroceryCategory.fruit, apple.getCategory());
		Assert.assertEquals("apple", apple.getName());
		Assert.assertEquals(GroceryStock.get("apple"), apple);

	}
}
