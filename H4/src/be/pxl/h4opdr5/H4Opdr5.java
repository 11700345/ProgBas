package be.pxl.h4opdr5;

import java.util.Scanner;

public class H4Opdr5 {

	public static void main(String[] args) {

		System.out.println("Geen een getal in");
		Scanner keyboard = new Scanner(System.in);
		int getal = keyboard.nextInt();

		while (getal > 100) {
			System.out.println(getal + "\t\t" + (3 * getal));
			System.out.println("Geen een getal in");
			getal = keyboard.nextInt();
		}
		keyboard.close();
	}
}