package be.pxl.h5.oef18;

import java.util.Scanner;

public class H5Opdr18 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;

		do {
			getal = keyboard.nextInt();
			String uitkomst = "";
			for (int i = 1; i <= getal; i++) {
				uitkomst += i + "*";
			}
			uitkomst += " != " + getal + "\n";
			System.out.println(uitkomst);
		} while (getal != 0);

		keyboard.close();
	}
}