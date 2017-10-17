package be.pxl.h5exoef8;

import java.util.Arrays;
import java.util.Scanner;

public class H5Exoef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();

		int[] abc = {a, b, c};
		Arrays.sort(abc);
		System.out.println(Arrays.asList(abc));
		
		keyboard.close();
	}
}