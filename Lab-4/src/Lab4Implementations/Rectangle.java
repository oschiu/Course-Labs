package Lab4Implementations;
import Lab4Interfaces.IShape;

public class Rectangle implements IShape{
	private int width;
	private int length;
	
	public Rectangle(int width, int length) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
	}

	public void draw() {
		System.out.println("Draw " + this.getClass());
	}
	
	public double area() {
		System.out.println ("Rectangle area = " + width + " x " + length + " = " + width*length);
		return width*length;
	}
}
