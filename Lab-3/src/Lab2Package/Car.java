package Lab2Package;

abstract public class Car {
	
	// private member variabel 
	private boolean engineStatus;
	static private int numberOfCars =0;
	static {
		System.out.println("Static block of the car");
	}
	static {
		System.out.println("Block 2");
	}
	
	// contstructor
	public Car() {
		// TODO Auto-generated constructor stub	
		engineStatus = false;
		numberOfCars++;
	}
	 
	/**
	 * method startEngine() is used to start the engine
	 * @return boolean - TRUE = successfully start the engine 
	 * 					 FALSE = start engine failed
	 */
	 abstract public boolean startEngine();
	 
	 final public void drive()
	 {
		 System.out.println("I am driving the car");
	 }
	 
	 public int totalCars()
	 {
		 System.out.println(numberOfCars);	 
		 return numberOfCars;
	 }

}
