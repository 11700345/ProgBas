package be.pxl.h5.oef16;

import java.util.Scanner;

public class H5Opdr16 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int snelsteRenner = 0;
		int snelsteTijd = 0;
		int langerDan1uur = 0;
		int tel = 0;

		System.out.println("Inschrijvingsnummer");
		int inschrijvingsnummer = keyboard.nextInt();
		while (inschrijvingsnummer > 0) {
			System.out.println("Aantal seconden");
			int aantalSeconden = keyboard.nextInt();

			if (aantalSeconden > 3600) {
				langerDan1uur++;
			}
			if (aantalSeconden > snelsteTijd) {
				snelsteTijd = aantalSeconden;
				snelsteRenner = inschrijvingsnummer;
			}

			tel++;
			System.out.println("Inschrijvingsnummer");
			inschrijvingsnummer = keyboard.nextInt();
		}
		int uur = snelsteTijd / 3600;
		int min = (snelsteTijd - (uur * 3600) / 60);
		int sec = (snelsteTijd - ((uur * 3600) + (min * 60)));

		System.out.println("Snelste renner is: " + snelsteRenner + "\nHij had een tijd van " + uur + " uur " + min
				+ " min en " + sec + " sec\nEr was " + ((double) langerDan1uur / tel * 100) + "% langer dan 1 uur.");

		keyboard.close();
	}
}