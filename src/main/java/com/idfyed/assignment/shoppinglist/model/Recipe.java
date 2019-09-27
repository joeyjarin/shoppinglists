/**
 * Copyright 2029 (C) Idfyed Solutions AB
 */
package com.idfyed.assignment.shoppinglist.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The abstraction of a food recipe.
 *
 */
public class Recipe {

	public Recipe(String name, List<Ingredient> ingredients, String description) {
		this.string = name;
		this.list = ingredients;
		this.text = description;
	}

	public String getName() {
		return string;
	}

	public List<Ingredient> getIngredients() {
		return list;
	}

	public String getDescription() {
		return text;
	}

	public static void main(String[] args) {
		Recipe r1 = new Recipe("MyRecipe", new ArrayList<>(), null);
		Recipe r2 = new Recipe("MyRecipe", new ArrayList<>(), null);

		if (r1.getName() == r2.getName()) {
			System.out.println("Recipes are equal!");
		} else {
			System.out.println("Recipes are not equal!");
		}
	}

	// ===== INTERNALS ===== //

	private String string;
	private List<Ingredient> list;
	private String text;
}
