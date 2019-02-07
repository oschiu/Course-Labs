/**
 * 
 */
package Lab2Package;

/**
 * @author ochiu
 *
 */
public class Oval extends Circle {
	private double radius;
	private Point[] ovalPoints;
	
	public Oval() {
		// TODO Auto-generated constructor stub
		SetRadius(10.0);
		System.out.println("Oval Constructor() called with default radius");
	}
	
	public Oval(double r) {
		// TODO Auto-generated constructor stub
		SetRadius(r);
		System.out.println("Oval Constructor() called with radius="+r);		
	}
	
	public Oval (Point ... p) {
		ovalPoints = p;
		System.out.println("Oval Constructor() has the following points:");
		for (Point pX: ovalPoints) {
			System.out.println(pX + ", ");	
		}
	}
		
	public void Draw() {
		System.out.println("Drawing an Oval with a " + style + " pen!");
	}

	static {
		System.out.println("This is inside the static block of oval");
	}
}
