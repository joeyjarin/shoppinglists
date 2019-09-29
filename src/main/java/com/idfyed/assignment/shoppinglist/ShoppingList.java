/**
 * Copyright 2019 (C) Diglias AB
 */
package com.idfyed.assignment.shoppinglist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.idfyed.assignment.shoppinglist.model.Grocery;
import com.idfyed.assignment.shoppinglist.model.GroceryCategory;
import com.idfyed.assignment.shoppinglist.model.Ingredient;
import com.idfyed.assignment.shoppinglist.model.Recipe;
import com.idfyed.assignment.shoppinglist.model.ShoppingEntry;
import com.idfyed.assignment.shoppinglist.model.Unit;

/**
 * A shopping list contains all groceries to purchase together with the amount.
 * 
 * The list can be updated by adding groceries of specified amounts and units
 * but also by adding ingredients from a recipe.
 * 
 * @see ShoppingEntr
 * @see Recipe
 * @see Grocery
 * @see Unit
 */
public class ShoppingList {

	/**
	 * Add a whole ingredient to the list
	 * 
	 * @param ingredient
	 */
	public void add(Recipe recipe) {
		recipe.getIngredients().forEach(this::add);
	}

	/**
	 * Add one grocery to the list
	 * 
	 * @param grocery
	 */
	public void add(Ingredient ingredient) {
		add(ingredient.getGrocery(), ingredient.getAmount(), ingredient.getUnit());
	}

	/**
	 * Add a grocery of a specified amount to the list.
	 * 
	 * @param grocery
	 * @param noOfGroceries
	 * @param unit
	 */
	public void add(Grocery grocery, Integer noOfGroceries, Unit unit) {
		ShoppingEntry existing = this.groceries.get(grocery.getName());
		// Is existing null?
		if (existing == null) {
			existing = new ShoppingEntry(grocery);
		}
		existing.add(noOfGroceries, unit);

		this.groceries.put(existing.getGrocery().getName(), existing);
	}

	/**
	 * Fetches one shopping list entry of a specified name. null if not found
	 * 
	 * @param groceryName
	 * @return shoppingEntry
	 */
	public ShoppingEntry get(String groceryName) {
		return this.groceries.get(groceryName);
	}

	/**
	 * Returns Grocery
	 * 
	 * @param category
	 * @return shoppingEntry collection
	 */
	public Collection<ShoppingEntry> getPerCategory(GroceryCategory category) {
		return this.groceries.values().stream().filter(g -> category.equals(g.getGrocery().getCategory()))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	// ===== INTRENALS ===== //
	private Map<String, ShoppingEntry> groceries = new HashMap<>();

}
