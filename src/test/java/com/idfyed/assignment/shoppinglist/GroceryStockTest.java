package com.idfyed.assignment.shoppinglist;

import org.testng.annotations.Test;

public class GroceryStockTest {

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "orange not found")
	public void getConverterTest() {
		GroceryStock.get("orange");
	}

}
