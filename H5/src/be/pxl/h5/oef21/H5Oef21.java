package be.pxl.h5.oef21;

import java.util.Scanner;

public class H5Oef21 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double jaarwedde;
		double eindejaarspremie;
		int code;
		
		System.out.println("Bruto jaarwedde: ");
		jaarwedde = keyboard.nextDouble();
		
		while(jaarwedde != 0) {
			System.out.println("Beoordelingscode (1 - 5): ");
			code = keyboard.nextInt();
			
			eindejaarspremie = berekeningPremie(jaarwedde, code);
			
			System.out.println("Eindejaarspremie: " + eindejaarspremie  + " euro.");
			
			System.out.println("Bruto jaarwedde: ");
			jaarwedde = keyboard.nextDouble();
			
		}
		
		keyboard.close();
	}
	
	public static double berekeningPremie(double jaarwedde, int code) {
		
		double percentage = 0;
		double vastGedeelte;
		double variabelGedeelte;
		double eindejaarspremie;
		
		switch (code) {
		case 1:
			percentage = 0;
			break;
		
		case 2:
			percentage = 0.18;
			break;
			
		case 3:
			percentage = 0.25;
			break;
			
		case 4:
			percentage = 0.33;
		
		default:
			System.out.println("foutive ingave");
					
	}
	
	vastGedeelte = jaarwedde / 20;
	variabelGedeelte = vastGedeelte * percentage;
	eindejaarspremie = vastGedeelte + variabelGedeelte;
	
	return eindejaarspremie;
		
	}

}
