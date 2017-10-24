package be.pxl.h6.oef4;

import java.util.Scanner;

public class H6Oef4 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		String tekst1 = i.nextLine() + "****";
		String tekst2 = "++++" + i.nextLine();
		
		tekst1 = tekst1.substring(0, 4);
		tekst2 = tekst2.substring((tekst2.length() - 4), tekst2.length());
		
//		for (int counter = 0; counter < (4 - tekst1.length()); counter++) {
//			tekst1 = tekst1 + "*";
//		}
//		
//		for (int counter = 0; counter < (4 - tekst1.length()); counter++) {
//			tekst2 = "+" + tekst2;
//		}
//		
		String tekstCombinatie =  tekst1 + tekst2;
		
		System.out.println(tekstCombinatie);
		 
		i.close();
	}

}
