package br.com.jadson.strutsbi.actions;

import static org.junit.Assert.*;

import org.junit.Test;

public class PurchasesActionTest {

	@Test
	public void testExecute() {
		PurchasesAction pa = new PurchasesAction();
		assertEquals("success", pa.execute());
		assertEquals(2, pa.getLastMonth().size());
		assertEquals(5, pa.getActualMonth().size());
		assertEquals(5, pa.getYear().size());
		
		
	}

}
