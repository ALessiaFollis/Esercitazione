package it.alessiaf.corso;

public class Calcolatrice {
	
	public Calcolatrice() {
		
	}
	
	public double Somma(double num1, double num2) {
		double s = num1+num2;
		System.out.println("Il risultato della somma è: "+s);
		return s;
	}
	
	public double Sottrazione(double num1, double num2) {
		double s =num1-num2;
		System.out.println("Il risultato della sottrazione è: "+s);
		return s;
	}
	
	public double Divisione(double num1, double num2) {
		if (num2==0) {
			throw new IllegalArgumentException("Non puoi dividere per zero!");
		}
		double s =num1/num2;
		System.out.println("Il risultato della divisione è: "+s);
		return s;
	}
	
	public double Potenza(double num1, double num2) {
		double s = Math.pow(num1, num2);
		System.out.println("Il risultato della potenza è: "+s);
		return s;
	}
	
	public double Media(double num1, double num2) {
		double s = (num1+num2)/2;
		System.out.println("Il risultato della media è: "+s);
		return s;
	}

}
