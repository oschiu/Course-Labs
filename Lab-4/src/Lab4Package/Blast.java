package Lab4Package;

public class Blast<T> {

	private T myType;
		
	public Blast(T type) {
		// TODO Auto-generated constructor stub
		myType = type;
	}

	public void align(T type) {	
		System.out.println("Aligning " + myType.getClass() + " with " + type.getClass());
	}
}
