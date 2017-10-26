package be.pxl.h7.oef2;

import java.util.Random;

public class H7Oef2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] rij = new int [500];
		int aantalOnder100 = 0;
		int totaal = 0;

		for (int n : rij) {
			rij[n] = random.nextInt();
			if (rij[n] < 100) {
				aantalOnder100 = aantalOnder100 + 1;
			}
			totaal = totaal + rij[n];
		}
		System.out.println(totaal + "\n" + aantalOnder100);
	}

}
