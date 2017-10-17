package be.pxl.h5.oef2;

import java.util.Scanner;

public class H5Oef2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double prijsPerArtikel = 11.5;
		double btw = 1.21;
		double prijs;		
		System.out.println("Hoeveel artikelsworden er besteld?");
		int aantalArtikelen = keyboard.nextInt();
		
		prijs = prijsPerArtikel * aantalArtikelen;
		
		System.out.println("met btw" + "\t\t" + "zonder btw");
		System.out.println(prijs + "\t\t" + (prijs * btw));

		keyboard.close();
	}
}