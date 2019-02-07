package Lab4Inheritance;


public class Circle extends Shape{
	int radius;
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		radius = r;
	}

	public double area() {
		System.out.println ("Circle area (" + radius + ") = " + 3.14*radius*radius);
		return (double) 3.14 * radius * radius;
	}
}
