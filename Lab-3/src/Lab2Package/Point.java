/**
 * 
 */
package Lab2Package;

/**
 * @author ochiu
 *
 */
public class Point {

	/**
	 * 
	 */
	private double x = 0;
	private double y = 0;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	/**
	 * Finding the distance from this Point to a new point (dest_x, dest_y)
	 * @param dest_x
	 * @param dest_y
	 * @return
	 */
	public double distance(double dest_x, double dest_y) {
		dest_x -= x;
		dest_y -= y;
		return Math.sqrt(Math.pow(dest_x, 2) + Math.pow(dest_y, 2));
	}
	
	/**
	 * 
	 */
	public double distance(Point pX) {
		pX.x -= x;
		pX.y -= y;
		return Math.sqrt(Math.pow(pX.x, 2) + Math.pow(pX.y, 2));
	}
}
