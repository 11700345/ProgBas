package be.pxl.h5.oef24;

import java.util.Scanner;

public class H5Opdr24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("aantal films");
		int aantalFilms = keyboard.nextInt();
		double totalePrijs = 0;
		double gemiddelde;

		for (int counter = 0; counter < aantalFilms; counter++) {
			System.out.println("genrenummer");
			int genreNummer = keyboard.nextInt();
			System.out.println("rating");
			int rating = keyboard.nextInt();
			System.out.println("leeftijd");
			int leeftijd = keyboard.nextInt();
			System.out.println("speeltijd");
			int speeltijd = keyboard.nextInt();
			
			double prijs = prijsFilm(rating, leeftijd, speeltijd, genreNummer);
			int huurtijd = huurTijd(rating, leeftijd, genreNummer);
			
			totalePrijs = totalePrijs + prijs;
			
			System.out.println("film" + counter + "\t�" + prijs + "\t" + huurtijd + " dagen");

		}
		gemiddelde = totalePrijs / aantalFilms;
		
		System.out.println("gemiddelde = �" + gemiddelde);
		
		keyboard.close();
	}

	public static double prijsFilm(int rating, double leeftijd, double speeltijd, int genreNummer) {
		double prijs;

		if ((genreNummer / 10000) == 1) {
			prijs = speeltijd * 0.005;
		} else {
			switch (rating) {
			case (3 | 2):
				prijs = 3.75;
				break;
			case (4 | 5):
				prijs = 4.5;
				break;
			default:
				prijs = 3;
				break;
			}

			if (leeftijd > 10) {
				prijs = prijs - 0.5;
			}
		}

		
		return prijs;
	}

	public static int huurTijd (int rating, int leeftijd, int genreNummer) {
		int huurtijd;
		
		if (rating == 5 && (leeftijd <=2 || (genreNummer / 10000) == 5)) {
			huurtijd = 1;
		} else {
			huurtijd = 2;
		}
		
		return huurtijd;
	}
}