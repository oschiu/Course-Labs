package Lab4Inheritance;

public class Rectangle extends Shape{
	private int width;
	private int length;
	
	public Rectangle(int width, int length) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
	}

	public double area() {
		System.out.println ("Rectangle area = " + width + " x " + length + " = " + width*length);
		return width*length;
	}
}
