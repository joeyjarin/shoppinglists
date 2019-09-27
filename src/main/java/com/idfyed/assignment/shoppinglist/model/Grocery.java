/**
 * Copyright 2019 (C) ACME AB
 */
package com.idfyed.assignment.shoppinglist.model;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.lang3.StringUtils;

import com.idfyed.assignment.shoppinglist.DefaultConverters;
import com.idfyed.assignment.shoppinglist.UnitConverter;

/**
 * Class implementing a grocery, e.g. milk or apples.
 */
public class Grocery {

	public Grocery(String name, GroceryCategory category, Unit unit, UnitConverter... unitConverters) {
		this.name = name;
		this.category = category;
		this.defaultUnit = unit;
		this.converters = Arrays.asList(unitConverters);
	}

	public String getName() {
		return name;
	}

	public GroceryCategory getCategory() {
		return category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Unit getUnit() {
		return defaultUnit;
	}

	/**
	 * Gets a {@link Converter}, converting this grocery amounts between given
	 * units.
	 * 
	 * @param from Convert from-unit
	 * @param to   Convert to-unit
	 * @return A converter, or {@link IllegalArgumentException} if not found.
	 */
	public UnitConverter getConverter(Unit from, Unit to) {

		ListIterator<UnitConverter> converterIter = this.converters.listIterator();
		while (converterIter.hasNext()) {
			UnitConverter next = converterIter.next();
			if (next.matches(from, to)) {
				return next;
			}
		}
		return DefaultConverters.convert(from, to);
	}

	@Override
	public boolean equals(Object objIn) {
		if (objIn == null) {
			return false;
		}
		if (!(objIn instanceof Grocery)) {
			return false;
		}
		Grocery obj = (Grocery) objIn;
		return StringUtils.equalsIgnoreCase(this.name, obj.getName()) && this.category.equals(this.getCategory())
				&& this.defaultUnit.equals(obj.getUnit());
	}

	// ===== INTERNALS ===== //

	private String name;
	private Unit defaultUnit;
	private List<UnitConverter> converters;
	private GroceryCategory category;

}
