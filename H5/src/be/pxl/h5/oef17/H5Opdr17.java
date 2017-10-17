package be.pxl.h5.oef17;

public class H5Opdr17 {
	public static void main(String[] args) {
		String uitkomst = "";
		
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 10; y++) {
				uitkomst += y * x + "\t";
			}
			uitkomst += "\n";
		}
		System.out.println(uitkomst);
	}

}
