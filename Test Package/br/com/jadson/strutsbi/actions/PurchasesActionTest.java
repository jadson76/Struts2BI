package br.com.jadson.strutsbi.actions;

import static org.junit.Assert.*;

import org.junit.Test;

public class PurchasesActionTest {

	@Test
	public void testExecute() {
		PurchasesAction pa = new PurchasesAction();
		assertEquals("success", pa.execute());
		assertEquals(3, pa.getLastMonth().size());
		assertEquals(3, pa.getActualMonth().size());
		assertEquals(3, pa.getYear().size());
		
		
	}

}
