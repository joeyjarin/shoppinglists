/**
 * Copyright 2019 (C) Idfyed AB
 */
package com.idfyed.assignment.shoppinglist.model;

/**
 * An abstraction of a shop.
 */
public class Shop {

	Shop(String name) {
		this.name = name;
	}
	
	Shop(String name, int id) {
		this.name = name;
		 this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	// ===== INTERNALS ===== //
	private String name;
	private int id = 42; //default value?
}
