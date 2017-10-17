package be.pxl.h4Oef6;

import java.util.Scanner;

public class H4Oef6 {

	public static void main(String[] args) {
		int totaal;
		Scanner keyboard = new Scanner(System.in);
		int factor = keyboard.nextInt();

		for (int counter = 1; counter <= 20; counter++) {
			totaal = counter * factor;
			System.out.println(counter + "\t*\t" + factor + "\t=\t" + totaal);
		}
		keyboard.close();
	}
}