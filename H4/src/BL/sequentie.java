package BL;

import java.util.Scanner;

public class sequentie {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = keyboard.nextInt(); //Input a
		
		System.out.println("Enter another number");
		int b = keyboard.nextInt(); //Input B
		
		int sum = a + b;
		
		System.out.println("The sum is " + sum); //Output

	}

}
