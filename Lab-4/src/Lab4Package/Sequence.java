package Lab4Package;

public class Sequence {
	protected StringBuffer rawSequence;
	public String description;

	// Constructors
	public Sequence() {
		rawSequence = new StringBuffer();
		description = "";
	}
	
	// getRawSeqeunce method
	// return the rawSequence
	public String getRawSequence() {
		return rawSequence.toString();
	}
	
	// setRawSeqeunce method
	// set the rawSequence value
	public void setRawSequence(String seq) {
		rawSequence = new StringBuffer(seq);
	}
	
	// getDescription method
	// return the sequence description
	public String getDescription() {
		return description;
	}
	
	// setDescription method
	// set sequence description value
	public void setDescription(String str) {
		description = str;
	}
}
