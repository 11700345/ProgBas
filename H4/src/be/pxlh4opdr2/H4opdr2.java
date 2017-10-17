package be.pxlh4opdr2;

import java.util.Scanner;

public class H4opdr2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your age:");
		int age = keyboard.nextInt();
		keyboard.close();

		if (age >= 18) {
			System.out.println("You are an adult");
		} else {
			if (age >= 10) {
				System.out.println("You are a teenager");
			} else {
				if (age >= 2) {
					System.out.println("you are a child");
				} else {
					System.out.println("You are a baby");
				}
			}
		}
	}
}
