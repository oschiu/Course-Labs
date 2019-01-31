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

}
