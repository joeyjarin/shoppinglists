/**
 * Copyright 2019 (C) Idfyed Solution AB
 */
package com.idfyed.assignment.shoppinglist;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.idfyed.assignment.shoppinglist.exceptions.ItemNotFoundException;
import com.idfyed.assignment.shoppinglist.model.GroceryCategory;
import com.idfyed.assignment.shoppinglist.model.Ingredient;
import com.idfyed.assignment.shoppinglist.model.Recipe;
import com.idfyed.assignment.shoppinglist.model.Unit;

import junit.framework.Assert;

/**
 * 
 */
public class IntegrationTest {

	@Test
	public void testAll() {
		Recipe pie;
		try {
			pie = new Recipe("pie",
					Arrays.asList(new Ingredient(200, Unit.ml, GroceryStock.get("flour")),
							new Ingredient(300, Unit.ml, GroceryStock.get("oats")),
							new Ingredient(2, Unit.pcs, GroceryStock.get("apple")),
							new Ingredient(5, Unit.ml, GroceryStock.get("salt")),
							new Ingredient(100, Unit.mg, GroceryStock.get("butter"))),
					"Apple pie");
			Recipe bread = new Recipe("Levain bread",
					Arrays.asList(new Ingredient(750, Unit.ml, GroceryStock.get("flour")),
							new Ingredient(50, Unit.mg, GroceryStock.get("butter")),
							new Ingredient(3, Unit.tbsp, GroceryStock.get("salt"))),
					"Bread");

			ShoppingList list = new ShoppingList();

			pie.getIngredients().stream().forEach(ingredient -> list.add(ingredient));
			bread.getIngredients().stream().forEach(ingredient -> list.add(ingredient));

			Assert.assertEquals(50, list.get("salt").getAmount());
			Assert.assertEquals(950, list.get("flour").getAmount());
			Assert.assertEquals(1, list.getPerCategory(GroceryCategory.fruit).size());
		} catch (ItemNotFoundException e) {
			Assert.fail();
		}
	}
}
