package Lab4Factory;

import Lab4Interfaces.IShape;
import Lab4Implementations.*;

public class IShapeFactory {

	static public IShape getShape() {
	
		int x = (int) (Math.random() * 100);	
		switch (x & 0x00001) {
		case 0x00001:
			return new Circle(x % 20);
		default:
			return new Rectangle(x % 10, x % 40);	
		}
	}
}
