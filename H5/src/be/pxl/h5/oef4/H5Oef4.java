package be.pxl.h5.oef4;

import java.util.Scanner;

public class H5Oef4 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int seconden = 0;
		int minuten = 0;
		int uren = 0;
		System.out.println("Hoeveel seconden?");
		int inputInSeconden = keyboard.nextInt();

		uren = inputInSeconden / 3600;
		minuten = (inputInSeconden % 3600) / 60;
		seconden = (inputInSeconden % 3600) % 60;

		System.out.println("Uren:\t\t" + uren);
		System.out.println("Minuten:\t" + minuten);
		System.out.println("Seconden:\t" + seconden);

		keyboard.close();
	}
}