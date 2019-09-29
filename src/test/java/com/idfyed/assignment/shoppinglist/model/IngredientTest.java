package com.idfyed.assignment.shoppinglist.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IngredientTest {

	@Test
	public void getFieldsTest() {
		Grocery grocery = new Grocery("grocery1", GroceryCategory.dairy, Unit.l);
		Ingredient ingredient = new Ingredient(10, Unit.l, grocery);

		Assert.assertEquals(ingredient.getAmount(), 10);
		Assert.assertEquals(ingredient.getUnit(), Unit.l);
		Assert.assertEquals(ingredient.getGrocery(), grocery);
	}

}
