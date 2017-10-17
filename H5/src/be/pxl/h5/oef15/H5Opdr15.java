package be.pxl.h5.oef15;

import java.util.Scanner;

public class H5Opdr15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double[] tempPerDag = new double[10];
		double warmsteDag = -273.15;
		double gemTemperatuur = 0;

		for (int counter = 0; counter < 10; counter++) {
			System.out.print("Temperatuur dag " + (counter + 1) + ": ");
			tempPerDag[counter] = keyboard.nextDouble();
			if (tempPerDag[counter] > warmsteDag) {
				warmsteDag = tempPerDag[counter];
			}
			gemTemperatuur += tempPerDag[counter];
		}
		gemTemperatuur = gemTemperatuur / 10;
		System.out.println("\nOp de warmste dag was het " + warmsteDag + " graden.\nHet gemiddelde is " + gemTemperatuur
				+ " graden.");

		keyboard.close();
	}
}