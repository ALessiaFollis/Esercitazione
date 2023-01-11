package it.alessiaf.corso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {

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
}
