import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestException {

	public void manyExceptions ( ) {
		int i=0, j=0;
		String testArray[] = new String[10];
		
		try {
			for (i=0; i< 10; i++) {
				testArray[i] = "manyExceptions: Happy Valentine's day " + i;
			}
			for (j=0; j < 10; j++)
				System.out.println("manyExceptions: " + testArray[j]);
		} catch (ArithmeticException ex) {
			System.out.println("manyExceptions: ArithmeticException: " + ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("manyExceptions: ArrayIndexOutOfBoundsException: " + ex.getMessage());
		} finally {
			System.out.println("manyExceptions: Finally - Always run ");
		}
		
	}
	
	public static void test () throws MySequenceException, IOException {
		 // method body that could throw MySequenceException and IOException

		Sequence x = new Sequence ();
		
		throw new MySequenceException(x);
		
//		try {
//		      // do something
//		      // ......
//		   } catch (MySequenceException ex) {
//		      // Exception handler for MySequenceException
//		      // ......
//		   } catch (IOException ex) {
//		      // Exception handler for IOException
//		      // .....
//		   } finally {  // optional
//		      // These codes always run, used for cleaning up
//		      //......
//		   }
	}
	
	public static String tryWithResource (String filepath) throws IOException {
		StringBuffer myStr = new StringBuffer();
		
		try (FileReader input = new FileReader(filepath)) {
			char[] cbuf = new char[1000];
			
			myStr.delete(0, myStr.length());
			int dataSize = input.read(cbuf, 0, 1000);
			while (dataSize != -1) {
				myStr.append(cbuf, 0, dataSize);
				dataSize = input.read(cbuf, 0, 1000);
			}
		} 
		return myStr.toString();
	}
}
