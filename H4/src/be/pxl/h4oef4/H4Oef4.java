package be.pxl.h4oef4;

import java.util.Scanner;

public class H4Oef4 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoe oud is de film?");
		int leeftijdFilm = keyboard.nextInt();
		System.out.println("Wat is de rating van de film?");
		int rating = keyboard.nextInt();
		int prijs = 5;

		if (leeftijdFilm < 2) {
			prijs = (prijs + 1);
		}
		if (rating >= 4) {
			prijs = (prijs + 2);
		} else {
			if (rating == 3) {
				prijs = (prijs + 1);
			}
		}
		if (prijs > 7) {
			prijs = 7;
		}
		System.out.println("De film kost €" + prijs + ".");
		
		keyboard.close();

	}
}
