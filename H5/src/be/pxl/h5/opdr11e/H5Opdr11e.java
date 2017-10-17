package be.pxl.h5.opdr11e;

import java.util.Scanner;

public class H5Opdr11e {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Wat is uw leeftijd?");
		int leeftijd = keyboard.nextInt();
		System.out.println("Wat is uw burgerlijke staat?");
		int burgerlijkeStaat = keyboard.nextInt();
		
		
		
		keyboard.close();
	}
}