package it.ex2.tv;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Calcola {
	
	private int canale;
	
    final static Logger logger = Logger.getLogger(Calcola.class);
	
	public static void main(String[] args) {
		 Calcola obj = new Calcola();
		 obj.SetCanale();
		
	}
	
	public void StampaCanale() {
		System.out.println("Il canale è: "+canale);
	}
	
	public void SetCanale() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Inserisci il nuovo canale");
            canale = scanner.nextInt();
            StampaCanale();
            logger.info("Il canale settato è: "+ canale);
		}catch (InputMismatchException inputMismatchException) {
        	logger.error("Inserisci un numero non dei caratteri");
		}
		
		scanner.close();
	}
}
