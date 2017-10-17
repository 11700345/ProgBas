package be.pxl.h5.oef8;

import java.util.Scanner;

public class H5Oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Wat is het behaalde resultaat op 20?");
		int percentage = keyboard.nextInt() * 5;
		String graad;

		if (percentage < 60) {
			graad = "onvoldoende";
		} else {
			if (percentage < 70) {
				graad = "voldoende";
			} else {
				if (percentage < 80) {
					graad = "onderscheiding";
				} else {
					if (percentage < 90) {
						graad = "grote onderscheiding";
					} else {
						graad = "grootste onderscheiding";
					}
				}
			}
		}
		System.out.println(percentage + "%\t" + graad);

		keyboard.close();
	}
}