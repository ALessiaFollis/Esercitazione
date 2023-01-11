package it.alessiaf.corso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		
		Calcolatrice obj = new Calcolatrice();
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Inserisci il primo numero:");
		n1 = scann.nextDouble();
		System.out.println("Inserisci il secondo numero:");
		n2 = scann.nextDouble();
		
		obj.Somma(n1, n2);
		obj.Sottrazione(n1, n2);
		obj.Potenza(n1, n2);
		obj.Media(n1, n2);
		obj.Divisione(n1, n2);
	}

}
