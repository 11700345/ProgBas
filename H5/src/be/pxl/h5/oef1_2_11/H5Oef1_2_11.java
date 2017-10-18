package be.pxl.h5.oef1_2_11;

import java.util.Scanner;

public class H5Oef1_2_11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel omzettingen worden er gemaakt");
		int aantalOmzettingen = keyboard.nextInt();
		double fahrenheit;
		double celsius;
		
		
		
		for (int counter = 0; counter < aantalOmzettingen; counter++) {
			System.out.println("hoevel graden Fahrenheit?");
			fahrenheit = keyboard.nextDouble();
			celsius = omzettingFahrenheitCelsius(fahrenheit);
			System.out.println("Farenheit\tCelsius");
			System.out.println(fahrenheit + "\t" + celsius);
		}
		
		
		
		keyboard.close();
	}

	public static double omzettingFahrenheitCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		
		return celsius;
	}
}
