package be.pxl.h7.oef1;

import java.util.Scanner;

public class H7Oef1 {

	public static void main(String[] args) {
		int[] rij = new int[15];
		double gemiddelde = 0;
		int aantalOnderGemiddelde = 0;
		double percentOnderGemiddelde = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("geef 15 getallen in");
		
		for (int n : rij) {
			rij[n] = keyboard.nextInt();
			gemiddelde = gemiddelde + rij[n];
		}
		gemiddelde = gemiddelde / rij.length;
		
		for (int counter = 0; counter < rij.length; counter++) {
			if (rij[counter] < gemiddelde) {
				aantalOnderGemiddelde = aantalOnderGemiddelde + 1;
			}
		}
		percentOnderGemiddelde = (aantalOnderGemiddelde / gemiddelde) * 100;
		
		System.out.printf("Gemiddelde = %.1F aantal Aantal onder het gemiddelde = %D (%.2F)",gemiddelde, aantalOnderGemiddelde, percentOnderGemiddelde);
		
		keyboard.close();
	}

}
