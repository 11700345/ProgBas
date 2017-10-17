package be.pxl.h5.opdr16;

import java.util.Scanner;

public class HOpdr16b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef uw bedrag in.");
		double belasting = belastingBerekening(keyboard.nextInt());

		System.out.println("Uw belastinf bedraagt €" + belasting);

		keyboard.close();

	}

	public static double belastingBerekening(int bedrag) {
		double result;

		if (bedrag <= 25000) {
			result = bedrag * 0.384;
		} else {
			if (bedrag <= 55000) {
				result = 9600 + (bedrag - 25000) * 0.5;
			} else {
				result = 24600 + (bedrag - 55000) * 0.6;
			}
		}
		return result;
	}
}
