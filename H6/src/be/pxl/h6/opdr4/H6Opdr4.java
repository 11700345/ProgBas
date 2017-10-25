package be.pxl.h6.opdr4;

public class H6Opdr4 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("This is my first line of text\nThis is my second line of text");
		
		str = str.append("\nThis is my first line of text and this is what I added.");
		
		str = str.append(("\n" + str.reverse()));
				
		System.out.print("str");
	}
	

}
