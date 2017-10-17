package be.pxl.h5.oef20;

import java.util.Scanner;

public class H5Oef20 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal, faculteit;
		
		System.out.println("geef een getal in");
		getal = keyboard.nextInt();
		
		while(getal != 0) {
			
			faculteit = berekeningFaculteit(getal);
			System.out.println("De faculteit van " + getal + " is " + faculteit);
			System.out.println("geef een getal in");
			getal = keyboard.nextInt();
		}
		
		keyboard.close();
	}
	
	public static int berekeningFaculteit(int getal) {
		int faculteit = 1;
					
		for (int counter = 0; counter < getal; counter++) {
			faculteit *= (getal - counter);
		}	

		return faculteit;
	}
}