package be.pxl.h5.oef22;

import java.util.Scanner;

public class H5Opdr22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de lengte in.");
		double lengte = keyboard.nextDouble();
		System.out.println("Geef de lengte in.");
		double breedte = keyboard.nextDouble();
		System.out.println("Hoeveel liter past er in één pot?");
		int capaciteitPot = keyboard.nextInt();
		
		double volume = berekeningHoeveelheidVerf(lengte, breedte);
		int aantalPotten = berekeningAantalPotten(volume, capaciteitPot);
		
		System.out.println(aantalPotten);
		
		keyboard.close();
	}
	
	public static double berekeningHoeveelheidVerf(double lengte, double breedte) {
		final double oppervlakteVolumeVerhouding = 7;
		
		double volume = oppervlakteVolumeVerhouding * lengte * breedte;
		
		return volume;
	}
	
	public static int berekeningAantalPotten(double volume, int capaciteitPot) {
		int aantalPotten = (int) (volume / capaciteitPot);
		
		if (((volume / capaciteitPot) % 1) != 0) {
			aantalPotten = aantalPotten + 1;
		}
		
		return aantalPotten;
	}
}