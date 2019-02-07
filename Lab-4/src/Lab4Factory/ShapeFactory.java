package Lab4Factory;

import Lab4Inheritance.*;

public class ShapeFactory {

	static public Shape getShape() {
	
		int x = (int) (Math.random() * 100);	
		switch (x & 0x00001) {
		case 0x00001:
			return new Circle(x % 20);
		default:
			return new Rectangle(x % 10, x % 40);	
		}
	}
}
