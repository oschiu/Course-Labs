import Lab2Package.*;

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
		Car myCar;
		myCar = new SUV();
		if (myCar.startEngine()) {
			myCar.drive();
			System.out.println("Go to school!");		
		}
		else
			System.out.println("Stuck at home!");
		
		Car car2 = new SUV();
		Car car3 = new SUV();
		
		car2.totalCars();
		car3.totalCars();

		
		
		
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
		
		Point p1 = new Point(10,10);
		Point p2 = new Point(1,1);
		Point p3 = new Point(2,0);
		Point p4 = new Point(1,-1);
		Oval o2 = new Oval (p1, p2, p3, p4);
//		Oval o2 = new Oval ();
		System.out.println("---------");
		
		double dX = 30; 
		double dY = 40;
		double distanceResult = p1.distance(dX, dY);
		System.out.println("Distance1 from (" + dX + ", " + dY + ") = " + distanceResult);
		
		Point pX = new Point(30, 40);
		distanceResult = p1.distance(pX);
		System.out.println("Distance2 from " + pX + " = " + distanceResult );		
	}
}
