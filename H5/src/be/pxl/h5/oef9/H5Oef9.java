package be.pxl.h5.oef9;

import java.util.Scanner;

public class H5Oef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int a = 4;
		int b = 5;
		System.out.println("Wat is de bewerkingscode");
		int bewerkingscode = keyboard.nextInt();

		switch (bewerkingscode) {
		case 1:
			System.out.println(a + b);
			break;
		case (2):
			System.out.println(a - b);
			break;
		case (3):
			System.out.println(a * b);
			break;
		case (4):
			System.out.println(a * b);
			break;
		default:
			System.out.println(b * b);
			break;
		}
		keyboard.close();
	}
}