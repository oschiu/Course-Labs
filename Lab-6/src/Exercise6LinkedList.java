import java.util.LinkedList;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;

public class Exercise6LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> mylist = new LinkedList<Integer>();
		ArrayList<Integer> myarray = new ArrayList<Integer>();
	
		System.out.println("Add() operation. Faster collection is " + 
							printResult(addPerformance(mylist), addPerformance(myarray)));
		System.out.println("Get() operation. Faster collection is " + 
							printResult(getPerformance(mylist), getPerformance(myarray)));
		System.out.println("Remove() operation. Faster collection is " + 
				printResult(removePerformance(mylist), removePerformance(myarray)));
	}
	/**
	 * format output result
	 */
	public static String printResult(long linkedTime, long arrayTime) {
		String whoIsFaster;
		double ratio;
		if (linkedTime > arrayTime) {
			whoIsFaster = "myArray";
			ratio = (double)(linkedTime - arrayTime)/arrayTime; 
		} else {
			whoIsFaster = "myList";
			ratio = (double)(arrayTime - linkedTime)/linkedTime;
		}
		NumberFormat n = NumberFormat.getPercentInstance(Locale.US);
		return whoIsFaster + " by " + n.format(ratio);
//		return whoIsFaster + " by " + ratio;
	}
	/**
	 * Test the difference between add function
	 */
	public static long addPerformance(Collection<Integer> x) {
		long startT = System.nanoTime();
		for (int i=0; i<10000; i++) {
			x.add(i);
		}
		long endT = System.nanoTime();
		System.out.println("Total time to call " + x.getClass().getSimpleName() +
							".add() = " + (endT-startT));
		return endT-startT;
	}
	/**
	 * Test the difference between get function
	 * @param x
	 */
	public static long getPerformance(LinkedList<Integer> x) {
		long startT = System.nanoTime();
		for (int i=0; i<10000; i++) {
			x.get(i);
		}
		long endT = System.nanoTime();
		System.out.println("Total time to call " + x.getClass().getSimpleName() +
				".get() = " + (endT-startT));
		return endT-startT;
	}
	/**
	 * Test the difference between get function
	 * @param x
	 */
	public static long getPerformance(ArrayList<Integer> x) {
		long startT = System.nanoTime();
		for (int i=0; i<10000; i++) {
			x.get(i);
		}
		long endT = System.nanoTime();
		System.out.println("Total time to call " + x.getClass().getSimpleName() +
				".get() = " + (endT-startT));
		return endT-startT;
	}
	/**
	 * Test the difference between remove function
	 * @param x
	 */
	public static long removePerformance(Collection<Integer> x) {
		long startT = System.nanoTime();
		for (int i=0; i<10000; i++) {
			x.remove(i);
		}
		long endT = System.nanoTime();
		System.out.println("Total time to call " + x.getClass().getSimpleName() +
				".remove() = " + (endT-startT));
		return endT-startT;
	}
}
