package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.idfyed.assignment.shoppinglist.GroceryStock;
import com.idfyed.assignment.shoppinglist.exceptions.ItemNotFoundException;

public class GroceryTest {

	@Test
	public void getFieldsTest() {
		Grocery apple = new Grocery("apple", GroceryCategory.fruit, Unit.pcs);

		Assert.assertEquals("apple", apple.getName());
		Assert.assertEquals(GroceryCategory.fruit, apple.getCategory());
		Assert.assertEquals("apple", apple.getName());
		try {
			Assert.assertEquals(GroceryStock.get("apple"), apple);
		} catch (ItemNotFoundException e) {
			Assert.fail();
		}

	}
}
