import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * A sequence base class
 *
 */
public class Sequence {
	// Variables -------------------------------------------------
	protected String rawSequence;	// variable to store raw sequence

	// Constructors ----------------------------------------------
	public Sequence() {
		rawSequence = "";
	}
	public Sequence(String seq) {
		rawSequence = seq;
	}
	
	// Getter/Setter methods -------------------------------------
	/**
	 * Retrieve the raw sequence of this object
	 * @return this instance of the raw sequence
	 */
	public String getSequence() {
		return rawSequence;
	}
	/**
	 * Set the raw sequence 'seq' to this object
	 * @param seq - the raw sequence you want to store
	 */
	public void setSequence(String seq) throws MySequenceException, IOException {
		rawSequence = seq;
	}
	
	// Methods ---------------------------------------------------
	/**
	 *  Read the data from a file and set to the raw sequence of this object
	 * @param filepath the path to the file that contains the sequence to load
	 * e.g. "C:/Oliver/Projects/Assignment 1/1k_Sample.txt"
	 */
	public void readSequenceFromFile(String filepath){
		try {
			rawSequence = new String(Files.readAllBytes(Paths.get(filepath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Retrieve the raw sequence of this this object and write to a file
	 * @param filepath - the path to the file where the raw sequence will be saved
	 */
	public void writeSequenceToFile(String filepath){
		try {
			Files.write(Paths.get(filepath), rawSequence.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	/**
	 * Read data from a file and test the time required to concatenate the data 
	 * to itself for N number of times
	 * @param filepath - the path of the file that contains the sequence
	 * @param n_times - the number of times to concatenate sequence to itself
	 * @return time elapsed in nanoseconds required to concatenate sequence to itself the indicated number of times
	 */
	public long testConcatenate(String filepath, int n_times){
		
		readSequenceFromFile(filepath);
		
		long t1 = System.nanoTime();
		concatenate(rawSequence, n_times);
		long t2 = System.nanoTime();
		
		return t2 - t1;
	}
	/**
	 * This method concatenates a string to the end of sequence N number of times
	 * @param s the string to concatenate to the end of sequence
	 * @param n_times - the number of times string 's' will be appended to the end
	 */
	public void concatenate(String s, int n_times) {

		for(int i=1; i <= n_times; i++){
			System.out.println("Concatenating "+ i + " of "+ n_times);
			rawSequence = rawSequence + s;
		}
	}
	/**
	 * A helper function to generate a default raw sequence. The sequence size
	 * will base on the number of iteration to append the 'base' sequence. The 
	 * 'base' sequence is a 10 base sequence "xACTGACTGy", where
	 *  x is digit 0 ~ 9, and only increments every 10 of the base sequences
	 *  y is digit 0 ~ 9, and increments every base sequence
	 *  @param 
	 */
	public void generateTestSeq(int n_times) {

		int j=0;
		rawSequence = "";
		for(int i=0; i < n_times; i++){
			System.out.println("Concatenating "+ i + " of "+ n_times);
			j = (i/10) % 10;
			rawSequence = rawSequence + j + "ATCGATCG" + (i%10);
		}
	}
}
