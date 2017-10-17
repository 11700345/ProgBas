package be.pxl.h5.oef3;

import java.util.Scanner;

public class H5Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double prijs;
		double prijsPerKm;

		System.out.println("hoeveel km wordt er afgelegd in één jaar?");
		double afstand = keyboard.nextDouble();
		System.out.println("Hoeveel liter wordt er verbuikt per 100km?");
		double verbruik = keyboard.nextDouble();
		System.out.println("Hoeveel kost 1l brandstof?");
		double brandstofPrijs = keyboard.nextDouble();

		prijs = afstand * verbruik * brandstofPrijs /100;
		prijsPerKm = verbruik * brandstofPrijs /100;

		System.out.println("De totale omkost per jaar is €" + prijs);
		System.out.println("De omkost per km is €" + prijsPerKm);

		keyboard.close();
	}
}