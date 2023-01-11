package it.alessiaf.day3;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {
	
	final Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calendario c = new Calendario();
		
		System.out.println("Numero eventi da inserire: ");
		int n = scan.nextInt();

		for (int i = 0; i<n; i++) {
			Evento e = new Evento();
	
			System.out.println("Inserisci un evento");
			System.out.println("Inserisci il nome");
			e.setNome(scan.next());
			System.out.println("Inserisci la descrizione");
			e.setDescrizione(scan.next());
			System.out.println("Inserisci il giorno");
			e.setGiorno(scan.nextInt());
			System.out.println("Inserisci il mese");
			e.setMese(scan.next());
			System.out.println("Inserisci l'anno");
			e.setAnno(scan.nextInt());
			c.addEvento(e);
		}
		
		c.vediEventi();
		

		
		
		
		
		scan.close();
	}

}
