import java.util.*;

public class Exercise6Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver e0 = new Driver();
		Driver e1 = new Driver();
		
		ArrayList<Driver> myDriverList = new ArrayList<Driver>();
//		myDriverList.ensureCapacity(31);
		printSize(myDriverList);
		myDriverList.add(0, e0);
		myDriverList.add(1, e1);
		printSize(myDriverList);
		Iterator<Driver> x = myDriverList.iterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		for (Driver d : myDriverList) {
			System.out.println(d);
		}
	}
	
	public static <T> void printSize(Collection<? extends T> e) {
		System.out.println("Total size of this array list=" + e.size());
	}

}
