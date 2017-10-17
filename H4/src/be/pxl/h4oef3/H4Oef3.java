package be.pxl.h4oef3;

import java.util.Scanner;

public class H4Oef3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel goederen worden er aangekocht?");
		int aantalGoederen = keyboard.nextInt();
		System.out.println("Wat is de eenheidsprijs?");
		int eenheidsprijs = keyboard.nextInt();
		
		int prijs = (aantalGoederen * eenheidsprijs);
		
		if (prijs >= 1000) {
			prijs = (prijs -22);
		} else {
			if (prijs > 500) {
				prijs = (prijs - 10);
			}
		}
		System.out.println("De totale prijs is €" + prijs + ".");
		
		keyboard.close();
	}
}