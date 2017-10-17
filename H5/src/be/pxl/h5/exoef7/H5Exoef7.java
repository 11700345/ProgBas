package be.pxl.h5.exoef7;

import java.util.Scanner;

public class H5Exoef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("prijs =");
		int prijs = keyboard.nextInt();
		System.out.println("artikelnummer =");
		int artikelNummer = keyboard.nextInt();
		int btwPercentage;
		double btw;

		switch (Integer.parseInt(Integer.toString(artikelNummer).substring(3))) {
		case 1:
			btwPercentage = 6;
			break;
		case (2):
			btwPercentage = 17;
			break;
		case (3):
			btwPercentage = 19;
			break;
		case (4):
			btwPercentage = 25;
			break;
		case (5):
			btwPercentage = 33;
			break;
		default:
			btwPercentage = 21;
			break;
		}
		btw = btwPercentage / 100D * prijs;

		System.out.println("artikelNummer = " + artikelNummer + "\tBTWpercentage = " + btwPercentage
				+ "%\tprijs excl. BTW = €" + prijs + "\tBTW = €" + btw);

		keyboard.close();
	}
}