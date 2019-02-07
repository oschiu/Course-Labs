package Lab4Inheritance;

public class Shape {
	public void draw() {
		System.out.println("Draw " + this.getClass());
	}
	
	public double area() {
		System.out.println("Default Shape Area");
		return 0.0;
	}
}
