package be.oef.h5.exoef22;

import java.util.Scanner;

public class H5Exoef22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char hoeksymbool = '+';
		char horizontaalSymbool = '-';
		char verticaalSymbool = '|';

		printGrid(hoeksymbool, horizontaalSymbool, verticaalSymbool);
		
		keyboard.close();
	}

	public static void printGrid(char hoeksymbool, char horizontaalSymbool, char verticaalSymbaal) {
		for (int k = 0; k < 4; k++) {
			for (int counter = 0; counter < 5; counter++) {
				System.out.print(hoeksymbool);
				for (int counter2 = 1; counter2 <= 9; counter2++) {
					System.out.print(horizontaalSymbool);
				}
			}
			System.out.print(hoeksymbool + "\n");
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 6; j++) {
					System.out.print("|         ");
				}
				System.out.print("\n");
			} 
		}
		for (int counter = 0; counter < 5; counter++) {
			System.out.print(hoeksymbool);
			for (int counter2 = 1; counter2 <= 9; counter2++) {
				System.out.print(horizontaalSymbool);
			}
		}
		System.out.print(hoeksymbool + "\n");
	}

}
