package be.pxl.h7.opdr1;

public class H7Opdr1 {

	public static void main(String[] args) {
		int[] veelvouden7 = new int[20];
		int[] rij = new int[10];
//		int[] rij = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		boolean[] booleans = new boolean[2];

		for (int counter = 0; counter < veelvouden7.length; counter++) {
			veelvouden7[counter] = (counter + 1) * 7;
			
		}
		
		for (int counter : veelvouden7) { 
			System.out.println(counter);
		}
		
		for (boolean counter : booleans) { 
			System.out.println(counter);
		}
		
		for (int counter = 0; counter < rij.length; counter++) {
			rij[counter] = counter * 2 + 1;
		}
		
		for (int counter : rij) { 
			System.out.println(counter);
		}
	}

}

