package HelloWorldPackage;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("First Java Progam for BIF812");
		
		Line myLine1 = new Line(0,0,30,40);
		Line myLine2 = new Line();
		Line myLine3 = new Line(0,0,30,40);
		if (myLine1 != myLine3)
			System.out.println("Line 2 == Line 3");
		
		myLine1.drawLine();
		myLine2.drawLine();
		
		Line.Point myPoint = myLine1.new Point(0.0, 0.0);
		
	}
}
