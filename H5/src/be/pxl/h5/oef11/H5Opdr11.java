package be.pxl.h5.oef11;

import java.util.Scanner;

public class H5Opdr11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int term1 = keyboard.nextInt();
		int term2 = keyboard.nextInt();
		int som;
		int aantalNegatieveGetallen;

		do  {
			som = term1 + term2;
			
			
		} while (term1 != 0 || term2 != 0);
		
		keyboard.close();
	}

}
