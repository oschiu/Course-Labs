package Lab4Implementations;
import Lab4Interfaces.IShape;

public class Circle implements IShape{
	int radius;
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		radius = r;
	}

	public void draw() {
		System.out.println("Draw " + this.getClass());
	}
	
	public double area() {
		System.out.println ("Circle area (" + radius + ") = " + 3.14*radius*radius);
		return (double) 3.14 * radius * radius;
	}
}
