package com.idfyed.assignment.shoppinglist;

import org.testng.annotations.Test;

import com.idfyed.assignment.shoppinglist.model.Unit;

import junit.framework.Assert;

public class DefaultConvertersTest {

	@Test
	public void convertTest() {
		Assert.assertEquals(1000, DefaultConverters.convert(Unit.dl, Unit.ml).convert(10));
		Assert.assertEquals(45, DefaultConverters.convert(Unit.tbsp, Unit.ml).convert(3));
	}
}
