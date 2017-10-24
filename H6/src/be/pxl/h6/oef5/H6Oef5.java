package be.pxl.h6.oef5;

public class H6Oef5 {

	public static void main(String[] args) {
		final int AANTALRIJEN = 9;
		
		for (int counter = 1; counter <= AANTALRIJEN; counter++) {
			
			for (int counter2 = 1; counter2 <= (AANTALRIJEN - counter); counter2++) {
				System.out.print(" ");
			}
			
			for (int counter2 = 1; counter2 <= (counter); counter2++) {
				System.out.print(counter2);
			}			
			
			System.out.print(",000000 ");
			
			
			
			
			for (int counter2 = 1; counter2 <= (counter); counter2++) {
				System.out.print(counter2);
			}			
			
			System.out.print(",000000 ");
			
			for (int counter2 = 1; counter2 <= (AANTALRIJEN - counter); counter2++) {
				System.out.print(" ");
			}
			System.out.print("\t");
			
			
			for (int counter2 = 1; counter2 <= (AANTALRIJEN - counter); counter2++) {
				System.out.print("0");
			}
			
			for (int counter2 = 1; counter2 <= (counter); counter2++) {
				System.out.print(counter2);
			}			
			
			System.out.print(",000000 \t");
			
			
			
			for (int counter2 = 1; counter2 <= (AANTALRIJEN - counter); counter2++) {
				System.out.print(" ");
			}
			
			for (int counter2 = 1; counter2 <= (counter); counter2++) {
				System.out.print(counter2);
			}			
			
			System.out.print(",000 ");
			
			System.out.print("\n");
		}

	}

}
