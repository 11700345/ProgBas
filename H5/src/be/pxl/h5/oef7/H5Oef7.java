package be.pxl.h5.oef7;

import java.util.Scanner;

public class H5Oef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Wat is de afstand van de vlucht?");
		int afstand = keyboard.nextInt();
		System.out.println("Met welke klasse wordt er gevlogen?");
		int klasse = keyboard.nextInt();
		float prijsPerAfstand;
		float prijs;

		if (afstand < 1000) {
			prijsPerAfstand = 0.25F;
		} else {
			if (afstand <= 2999) {
				prijsPerAfstand = 0.2F;
			} else {
				prijsPerAfstand = 0.12F;
			}
		}
		prijs = prijsPerAfstand * afstand;

		if (klasse > 2) {
			prijs = prijs * 1.3F;
		} else {
			if (klasse > 1) {
				prijs = prijs * 0.8F;
			}
		}
		System.out.println("€" + (int) prijs);

		keyboard.close();
	}
}