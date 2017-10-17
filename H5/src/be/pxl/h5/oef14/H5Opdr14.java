package be.pxl.h5.oef14;

import java.util.Scanner;

public class H5Opdr14 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String uitkomst = "";

		System.out.println("Geef een artikelnummer");
		int artikelnummer = keyboard.nextInt();

		while (artikelnummer != 999) {
			System.out.println("Hoeveelheid");
			int hoeveelheid = keyboard.nextInt();
			System.out.println("Eenheidsprijs");
			int eenheidsprijs = keyboard.nextInt();

			int bedrag = hoeveelheid * eenheidsprijs;

			uitkomst += artikelnummer + "\t\t" + hoeveelheid + "\t\t" + eenheidsprijs + "\t\t" + bedrag + "\n";
			System.out.println("Geef een artikelnummer");
			artikelnummer = keyboard.nextInt();
		}
		System.out.println("Artikelnummer:\tHoeveelheid:\tEenheidsprijs\tBedrag\n" + uitkomst);

		keyboard.close();
	}
}