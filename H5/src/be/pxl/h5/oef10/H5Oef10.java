package be.pxl.h5.oef10;

import java.util.Scanner;

public class H5Oef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int relatievePremie = 5;
		System.out.println("Wat is de beoordelingscode?");
		int code = keyboard.nextInt();
		System.out.println("Wat is de jaarwedde?");
		int jaarwedde = keyboard.nextInt();
		double premie;

		switch (code) {
		case (1):
			break;
		case (2):
			relatievePremie = relatievePremie + 18;
			break;
		case (3):
			relatievePremie = relatievePremie + 25;
			break;
		case (4):
			relatievePremie = relatievePremie + 33;
			break;
		default:
			System.out.println("foute beoordelingscode");
			break;
		}
		premie = jaarwedde * (relatievePremie / 100D);

		System.out.println("De eindejaarspremie = €" + premie);

		keyboard.close();
	}
}