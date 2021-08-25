package br.com.jadson.strutsbi.actions;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalesActionTest {
	
	private SalesAction action = new SalesAction();

	@Test
	public void testList6monthSales() {
		assertEquals("success", action.list6monthSales());
		assertEquals(6, action.getSalesMap().size());
		assertTrue(action.getSalesMap().containsKey("OUT"));
	}

}
