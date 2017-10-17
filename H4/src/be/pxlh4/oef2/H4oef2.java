package be.pxlh4.oef2;

import java.util.Scanner;

public class H4oef2 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef één getal in.");
		int getal1 = keyboard.nextInt();
		System.out.println("Geef nog één getal in.");
		int getal2 = keyboard.nextInt();
		int verschil;
		int term1;
		int term2;

		if (getal1 > getal2) {
			term1 = getal1;
			term2 = getal2;
			verschil = (getal1 - getal2);
		} else {
			term1 = getal2;
			term2 = getal1;
			verschil = (getal2 - getal1);
		}
		int totaal = verschil * 5;

		System.out.println(term1 + " - " + term2 + " = " + verschil);
		System.out.println(verschil + " x " + 5 + " = " + totaal);
		
		keyboard.close();
	}
}
