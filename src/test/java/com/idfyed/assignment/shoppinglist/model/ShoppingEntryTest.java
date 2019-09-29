package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingEntryTest {

	@Test
	public void getFieldsTest() {
		Grocery apple = new Grocery("apple", GroceryCategory.fruit, Unit.pcs);
		ShoppingEntry entry = new ShoppingEntry(apple);
		entry.add(10, Unit.pcs);

		Assert.assertEquals(entry.getGrocery(), apple);
		Assert.assertEquals(entry.getAmount(), 10);
	}
}
