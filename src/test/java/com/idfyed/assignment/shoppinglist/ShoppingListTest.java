package com.idfyed.assignment.shoppinglist;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.idfyed.assignment.shoppinglist.model.GroceryCategory;
import com.idfyed.assignment.shoppinglist.model.Unit;

public class ShoppingListTest {
	@Test
	public void addAmount() {
		ShoppingList target = new ShoppingList();

		target.add(GroceryStock.get("milk"), 2, Unit.pcs);
		target.add(GroceryStock.get("cream"), 3, Unit.pcs);
		target.add(GroceryStock.get("milk"), 1, Unit.pcs);
		target.add(GroceryStock.get("milk"), 1, Unit.tbsp);
		target.add(GroceryStock.get("apple"), 3, Unit.pcs);
		target.add(GroceryStock.get("oats"), 3, Unit.dl);

		Assert.assertEquals(3015, target.get("milk").getAmount());
		Assert.assertEquals(2, target.getPerCategory(GroceryCategory.dairy).size());
	}
}
