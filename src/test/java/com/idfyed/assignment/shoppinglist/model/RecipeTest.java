package com.idfyed.assignment.shoppinglist.model;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RecipeTest {

	@Test
	public void getNameTest() {
		Recipe r1 = new Recipe("MyRecipe", new ArrayList<>(), null);
		Recipe r2 = new Recipe("MyRecipe", new ArrayList<>(), null);

		Assert.assertEquals(r1.getName(), r2.getName());
	}
	
}
