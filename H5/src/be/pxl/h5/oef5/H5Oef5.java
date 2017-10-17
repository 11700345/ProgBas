package be.pxl.h5.oef5;

import java.util.Scanner;

public class H5Oef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int bedrag = keyboard.nextInt();
		int briefjes = 20;
		
		System.out.println((bedrag / briefjes) + " briefje(s) van 20 en €" + (bedrag % briefjes) + " rest");
		keyboard.close();
	}
}