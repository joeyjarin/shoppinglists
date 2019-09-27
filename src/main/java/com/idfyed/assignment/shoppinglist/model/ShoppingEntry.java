/**
 * Copyright 2019 (C) ACME Inc
 */
package com.idfyed.assignment.shoppinglist.model;

/**
 * An entry in a shopping list.
 */
public class ShoppingEntry {

	public ShoppingEntry(Grocery grocery) {
		this.grocery = grocery;
	}

	public Grocery getGrocery() {
		return grocery;
	}


	/**
	 * Adds to this entry, converting to target unit.
	 * 
	 * @param amount The amount to add.
	 * @param from The unit of the added amount.
	 */
	public void add(Integer amount, Unit from) {
		try {
			this.amount += grocery.getConverter(from, this.grocery.getUnit()).convert(amount);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getAmount() {
		return this.amount;
	}

	// ===== INTERNALS ===== //
	
	private Grocery grocery;
	private Integer amount;
}
