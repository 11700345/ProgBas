package be.pxl.h5.oef23;

import java.util.Scanner;

public class H5Oef23 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int driehoeksGrootte;
		
		System.out.println("Driehoeksgrootte: ");
		driehoeksGrootte = keyboard.nextInt();
		
		PrintDriekhoek(driehoeksGrootte);
		
		keyboard.close();
	}
	
	public static void PrintDriekhoek(int driehoeksGrootte) {
		int remainingLength = driehoeksGrootte;
		
		for(int counter = 0; counter < driehoeksGrootte; counter++) {
			System.out.println();
			
			for(int j = 0; j < remainingLength; j++) {
				System.out.print('@');
			}
			
			remainingLength--;
		}
	}

}
