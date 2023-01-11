package it.alessiaf.corso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CheckDivisione {

	@Test
	public void checkZero() {
		Calcolatrice calc = new Calcolatrice();
		IllegalArgumentException illegalArgumentException =
				 assertThrows(IllegalArgumentException.class,
	                		() -> calc.Divisione(1, 0));
		 assertEquals("Non puoi dividere per zero!",illegalArgumentException.getMessage());
	}
}
