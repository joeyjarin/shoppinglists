/**
 * Copyright 2019 (C) IDfyed AB
 */
package com.idfyed.assignment.shoppinglist;

import com.idfyed.assignment.shoppinglist.model.Unit;

/**
 * Converts from one unit to another.
 * 
 * <pre>
 * Unit.from = convertionRate * Unit.to
 * </pre>
 */
public class UnitConverter {

	// ===== INTERALS ===== //
	private Unit from;
	private int multiply;
	private Unit to;

	public UnitConverter(Unit from, int multiply, Unit to) {
		this.from = from;
		this.multiply = multiply;
		this.to = to;
	}

	public Unit getFrom() {

		// Return from
		return from;
	}

	public Unit getTo() {
		// Return to
		return to;
	}

	public int convert(int fromUnitAmount) {
		return fromUnitAmount * this.multiply;
	}

	public boolean matches(Unit from, Unit to) {
		if (this.from == from && this.to == to) {
			return true;
		} else {
			return false;
		}
	}
}
