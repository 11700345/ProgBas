package be.pxl.h5.oef19;


import java.util.Scanner;

public class H5Opdr19 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String driehoek = "";

		System.out.print("Grootte driehoek: ");
		int grootte = keyboard.nextInt();

		for (int y = grootte; y > 0; y--) {
			for (int x = y; x > 0; x--) {
				driehoek += "@";
			}
			driehoek += "\n";
		}
		System.out.println(driehoek);

		keyboard.close();
	}

}
