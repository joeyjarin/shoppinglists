/**
 * Copyright 2019 (C) Idfyed Solution AB
 */
package com.idfyed.assignment.shoppinglist;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import com.idfyed.assignment.shoppinglist.model.Grocery;
import com.idfyed.assignment.shoppinglist.model.GroceryCategory;
import com.idfyed.assignment.shoppinglist.model.Unit;

/**
 * The stock of groceries for the shop
 */
public class GroceryStock {

	private GroceryStock() {
		// to prevent this Helper class from getting instantiated.
	}
	
	/**
	 * Returns a grocery with specified name. IllegalArgument if not
	 * 
	 * @param name
	 * @return grocery
	 */
	public static Grocery get(String name) {
		Grocery grocery = GroceryStock.stock.get(name);		
		if (grocery == null) {
			throw new IllegalArgumentException(name + " not found");
		}
		return grocery;
	}

	// ===== INTERNALS ===== //
	private static Map<String, Grocery> stock = new HashMap<>();

	static {
		Grocery milk = new Grocery("milk", GroceryCategory.dairy, Unit.ml, new UnitConverter(Unit.pcs, 1000, Unit.ml));
		Grocery cream = new Grocery("cream", GroceryCategory.dairy, Unit.ml, new UnitConverter(Unit.pcs, 250, Unit.ml));
		Grocery apple = new Grocery("apple", GroceryCategory.fruit, Unit.pcs,
				new UnitConverter(Unit.pcs, 100, Unit.mg));
		Grocery oats = new Grocery("oats", GroceryCategory.flour, Unit.ml, new UnitConverter(Unit.pcs, 1000, Unit.mg));
		Grocery flour = new Grocery("flour", GroceryCategory.flour, Unit.ml,
				new UnitConverter(Unit.pcs, 1000, Unit.mg));
		Grocery butter = new Grocery("butter", GroceryCategory.dairy, Unit.mg,
				new UnitConverter(Unit.pcs, 500, Unit.mg));
		Grocery salt = new Grocery("salt", GroceryCategory.flour, Unit.ml);
		add(milk, cream, apple, oats, flour, butter, salt);
	}

	private static void add(Grocery... groceries) {
		for (Enumeration<Grocery> groceryEnumerator = new Vector<>(Arrays.asList(groceries))
				.elements(); groceryEnumerator.hasMoreElements();) {
			Grocery grocery = groceryEnumerator.nextElement();
			GroceryStock.stock.put(grocery.getName(), grocery);
		}
	}
}
