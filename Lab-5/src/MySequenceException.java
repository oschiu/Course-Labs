import java.lang.Exception;

public class MySequenceException extends Exception {
	private Sequence mySeq; 

	public MySequenceException(Sequence x) {
		// TODO Auto-generated constructor stub
		mySeq = x;
	}
	
	@Override
	public String toString ( ) {
		return "Hello Exception:" + mySeq; 
	}
}
