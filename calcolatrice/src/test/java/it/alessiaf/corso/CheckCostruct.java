package it.alessiaf.corso;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class CheckCostruct {
	
	@Test
	public void checkCostruttore() {
		Calcolatrice c = new Calcolatrice();
		assertSame(Calcolatrice.class, c.getClass());
	}

}
