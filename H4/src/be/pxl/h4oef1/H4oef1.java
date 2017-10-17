package be.pxl.h4oef1;

import java.util.Scanner;

public class H4oef1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel volwassenen zijn er?");
		int aantalVolwassenen = keyboard.nextInt();
		
		System.out.println("Hoeveel kinderen zijn er?");
		int aantalKinderen = keyboard.nextInt();
		
		System.out.println("€" + ((aantalVolwassenen * 28) + (aantalKinderen * 15)));
		
		keyboard.close();
	}
}
