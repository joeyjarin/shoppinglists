package com.idfyed.assignment.shoppinglist;

import org.testng.annotations.Test;

import com.idfyed.assignment.shoppinglist.exceptions.ItemNotFoundException;

public class GroceryStockTest {

	@Test(expectedExceptions = ItemNotFoundException.class, expectedExceptionsMessageRegExp = "orange not found")
	public void getConverterTest() throws ItemNotFoundException {
		GroceryStock.get("orange");
	}

}
