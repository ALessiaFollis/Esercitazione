package it.alessiaf.corso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalcolatriceTest {
	
	@Test
	public void checkCostruttore() {
		Calcolatrice c = new Calcolatrice();
		assertSame(Calcolatrice.class, c.getClass());
	}

	@Test
	public void checkOperazioni() {
		double a = 10;
		double b = 2;
		Calcolatrice cal = new Calcolatrice();
		
		assertEquals(cal.Somma(a, b), a+b);
		assertEquals(cal.Sottrazione(a, b), a-b);
		assertEquals(cal.Divisione(a, b), a/b);
		assertEquals(cal.Potenza(a, b), Math.pow(a, b));
		assertEquals(cal.Media(a, b), (a+b)/2);
	}
	
	@Test
	public void checkZero() {
		Calcolatrice calc = new Calcolatrice();
		IllegalArgumentException illegalArgumentException =
				 assertThrows(IllegalArgumentException.class,
	                		() -> calc.Divisione(1, 0));
		 assertEquals("Non puoi dividere per zero!",illegalArgumentException.getMessage());
	}
}
