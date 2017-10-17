package be.pxl.h5.opdr16;

import java.util.Scanner;

public class H5Opdr5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		toonTafel(keyboard.nextInt());
		
		
	}
	public static void toonTafel(int factor) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.println(counter * factor);
		}
	}
}