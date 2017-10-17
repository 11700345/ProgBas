package be.pxl.h5.oef6;

import java.util.Scanner;

public class H5Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double prijsPerArtikel = 11.5;
		final double BTW = 1.21;
		double prijs;
		double prijsMetBtw;
		System.out.println("Hoeveel artikelsworden er besteld?");
		int aantalArtikelen = keyboard.nextInt();

		prijs = prijsPerArtikel * aantalArtikelen;
		prijsMetBtw = prijs * BTW;

		if (prijsMetBtw > 1000) {
			prijsMetBtw = prijsMetBtw * 0.9;
		}

		System.out.println("zonder btw" + "\t\t" + "met btw");
		System.out.println(prijs + "\t\t" + (prijsMetBtw));

		keyboard.close();
	}
}