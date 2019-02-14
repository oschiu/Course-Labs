import java.util.ArrayList;
import java.util.List;


public class Exercise5Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape<Integer> myShape1 = new Shape<Integer>();
		Shape<String>  myShape2 = new Shape<String>();
		myShape1.add(new Integer(34));
		Integer x = myShape1.get();
		String str = myShape2.get();
		
		Driver d1 = new Driver();
		BusDriver bd1 = new BusDriver();
		List<BusDriver> myBusDrivers = new ArrayList<BusDriver>();
		List<Driver> myDrivers = new ArrayList<Driver>();
		List<Shape<String>> myShapeList = new ArrayList<Shape<String>>();
		
		myDrivers.add(bd1);
		BusDriver bd2 = (BusDriver) myDrivers.get(0);
		System.out.println("License for myCitizen: "+ bd2.getLicense());
		printAll(myDrivers);	//ok
		BusDriver goodDriver = Exercise5Generic.<Driver,BusDriver>search(d1, myDrivers, myBusDrivers);
		System.out.println("GoodDriver=" + goodDriver);
		
	}
	
	public static void printAll(List<? extends Driver> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}
	public static <K,V> V search(K key, List<K> lookupKey, List<V> lookupValue) {
		if (lookupKey.contains(key)) {
			return lookupValue.get(lookupKey.indexOf(key));
		}
		return null;
	}
}
