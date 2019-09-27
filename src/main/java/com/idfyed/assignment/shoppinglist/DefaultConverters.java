/**
 * Copyright 2019 (C) Idfyed Solution AB
 *
 */
package com.idfyed.assignment.shoppinglist;

import java.util.HashMap;
import java.util.Map;

import com.idfyed.assignment.shoppinglist.model.Unit;

/**
 * A collection of converters bewteen units
 */
public class DefaultConverters {

	public static UnitConverter convert(Unit from, Unit to) {

		// from check
		if (from.equals(to)) {
			return new UnitConverter(from, 1, to);
		}
		UnitConverter converter = DefaultConverters.converters.get(from);
		if (converter == null) {
			// BUGBUG: error?
			throw new IllegalArgumentException(
				String.format("unknown conversion: %s -> %s", from, to.toString()));
		}
		return converter;
	}

	////////////////// INTERNALS
	private static Map<Unit, UnitConverter> converters = new HashMap<>();
	static {
		DefaultConverters.converters.put(Unit.tbsp, new UnitConverter(Unit.tbsp, 15, Unit.ml));
		DefaultConverters.converters.put(Unit.dl, new UnitConverter(Unit.dl, 100, Unit.ml));
	}
}
