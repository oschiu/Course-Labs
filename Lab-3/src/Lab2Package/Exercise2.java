/**
 * 
 */
package Lab2Package;
import HelloWorldPackage.Line;


/**
 * @author ochiu
 *
 */
public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oval x = new Oval(75);
		System.out.println("---------");
		
		Circle c1 = new Circle();
		c1.Draw();
		c1.ChangeStyle(LineStyle.LOOSELY_DASHED);
		System.out.println("---------");
		
		Oval o1 = new Oval();
		o1.Draw();
		System.out.println("---------");
		
		Circle c2 = new Oval(22.0);
		c2.Draw();
		System.out.println("---------");
		
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,1);
		Point p3 = new Point(2,0);
		Point p4 = new Point(1,-1);
//		Oval o2 = new Oval (p1, p2, p3, p4);
		Oval o2 = new Oval ();
		System.out.println("---------");
		
//		Line myLine = new Line(11,22,33,44);
//		myLine.drawLine();
	}
}
