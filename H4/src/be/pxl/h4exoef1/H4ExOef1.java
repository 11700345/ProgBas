package be.pxl.h4exoef1;

import java.util.Scanner;

public class H4ExOef1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef één getal in.");
		int getal1 = keyboard.nextInt();
		System.out.println("Geef nog één getal in.");
		int getal2 = keyboard.nextInt();
		int kleinsteGetal;
		
		if (getal1 < getal2) {
			kleinsteGetal = getal1;
		} else {
			kleinsteGetal = getal2;
		}
		int kwadraad = (kleinsteGetal * kleinsteGetal);
		
		System.out.println("Het kleinste getal is " + kleinsteGetal + ".");
		System.out.println("Het kwadraad van het kleinste getal is " + kwadraad + ".");
		
		keyboard.close();
	}
}