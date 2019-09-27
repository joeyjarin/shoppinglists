/**
 * Copyright 2019 (C) Idfyed Solutions AB
 *
 */
package com.idfyed.assignment.shoppinglist.model;

/**
 * The abstraction of a recipe ingredient.
 * 
 */
public class Ingredient {

	public Ingredient(int amount, Unit unit, Grocery grocery) {
		this.amount = amount;
		this.unit = unit;
		this.grocery = grocery;
	}

	public Ingredient(Ingredient ingredient) {

		// FIXME:
		this.amount = ingredient.getAmount();
		this.unit = ingredient.getUnit();
		this.grocery = ingredient.getGrocery();
	}

	public int getAmount() {
		return this.amount;
	}

	public Unit getUnit() {
		return this.unit;
	}

	public Grocery getGrocery() {
		return this.grocery;
	}

	// /////INTERNALS ///// //

	private int amount;
	private Unit unit;
	private Grocery grocery;

}
