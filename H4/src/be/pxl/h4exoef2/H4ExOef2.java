package be.pxl.h4exoef2;

import java.util.Scanner;

public class H4ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef ��n getal in.");
		int a = keyboard.nextInt();
		System.out.println("Geef nog ��n getal in.");
		int b = keyboard.nextInt();
		System.out.println("Geef nogmaals ��n getal in.");
		int c = keyboard.nextInt();

		if ((a + b) < 20) {
			System.out.println((a + b + c));
		} else {
			System.out.println("te groot");
		}
		keyboard.close();
	}
}