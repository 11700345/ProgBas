package be.pxl.h7.opdr2;

import java.util.Scanner;

public class H7Opdr2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("woorden");
		String woorden = keyboard.nextLine();
		String[] lijst = woorden.split(" ");
		
		for (String n : lijst) {
			System.out.println(n);
		}

	}

}
