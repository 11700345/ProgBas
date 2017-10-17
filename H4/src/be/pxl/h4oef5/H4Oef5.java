package be.pxl.h4oef5;

public class H4Oef5 {

	public static void main(String[] args) {

		System.out.println("aantal appels\t\tgewicht in gram");

		for (int aantalAppels = 1; aantalAppels <= 100; aantalAppels++) {
			int gewicht = aantalAppels * 165;
			System.out.println(aantalAppels + "\t\t\t" + gewicht);
		}
	}
}