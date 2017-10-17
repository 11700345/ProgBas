package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		final double EUROBEFVERHOUDING = 40.3399;
		System.out.println("Wat is het bedrag in bef?");
		double bedragInBef = keyboard.nextDouble();
		double bedragInEuro = bedragInBef / EUROBEFVERHOUDING;

		System.out.println("bef is gelijk aan €" + bedragInEuro + ".");

		keyboard.close();

	}
}