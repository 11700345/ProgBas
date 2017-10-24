package be.pxl.h6.oef2;

import java.util.*;

public class H6Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String str = keyboard.nextLine();
		
		int positieT =  str.toUpperCase().indexOf(str, 'T');
		
		if ((str.length() % 2) == 0 ) {
			str = str.toLowerCase();
		} else {
			str = str.toUpperCase();
		}
		
		if (positieT == -1) {
			System.out.println("Geen t/T gevonden");
		}
		
		System.out.println(str);
		
		keyboard.close();

	}

}
