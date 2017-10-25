package be.pxl.h6.oef7;

import java.awt.Point;

public class H6Oef7 {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(5, 8);
		// 2 verschillende objecten

		p1.setLocation(5, 8);
		p2.setLocation(p2.getX() + 2, p2.getY() + 3);
		
		System.out.println("de x en y coördinaten van p1 zijn : " + p1.getX() + "-" + p1.getY());
		System.out.println("de x en y coördinaten van p2 zijn : " + p2.getX() + "-" + p2.getY());

	}

}
