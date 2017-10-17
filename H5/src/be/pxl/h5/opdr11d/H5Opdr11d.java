package be.pxl.h5.opdr11d;

import java.util.Scanner;

public class H5Opdr11d {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel weegt u ?");
		double gewicht = keyboard.nextDouble();
		System.out.println("Hoe lang bent u in m?");
		double lengte = keyboard.nextDouble();
		double bmi = gewicht / (lengte * lengte);

		if (bmi < 18) {
			System.out.println("ondergewicht");
		} else {
			if (bmi < 25) {
				System.out.println("ok");
			} else {
				if (bmi < 30) {
					System.out.println("overgewicht");
				} else {
					if (bmi < 40) {
						System.out.println("obesitas");
					} else {
						System.out.println("ziekelijk overgewicht");
					}
				}
			}
		}

		keyboard.close();
	}
}