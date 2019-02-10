/**
 * 
 */
package Lab2Package;

/**
 * @author ochiu
 *
 */
public class Circle {

	private double radius;
	private Point centre;
	protected static LineStyle style = LineStyle.THICK_SOLID;
	
	static {
		System.out.println("This is inside the static block of circle");
	}
	
	public Circle(double r) {
		radius = r;
		System.out.println("Circle constructor is called. Set radius to "+radius);		
	}
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 5.0;
		centre = new Point(0, 0);
		System.out.println("Circle constructor is called. Set radius to "+radius);
	}

	public void SetRadius(double r) {
		radius = r;
	}
	
	public void Draw() {
		System.out.println("Drawing a Circle " + centre + " of radius=" + radius + " with a " + style + " pen!");
	}
	
	/**
	 * Find out the intersect coordinates of this circle with another circle
	 * @param subling
	 * @return Point[] - an array of Point objects, if this circle doesn't intersect with the input circle, return a null array
	 */
	public Point[] Intersects(Circle subling) {
		Point[] intersectPoints = null;
		
		
		return intersectPoints;
	}
	
	public static void ChangeStyle(LineStyle s) {
		style = s;
	}
	


}
