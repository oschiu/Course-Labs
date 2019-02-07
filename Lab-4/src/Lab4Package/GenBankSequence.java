package Lab4Package;

public class GenBankSequence extends Sequence {
	// fields
	public String description;
	private String locus;
	private String accession;
	private String NCBI_Identifier;
	
	public GenBankSequence() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRawSequence() {
		// call superclass method to return the sequence
		return super.getRawSequence();	
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
	
	public String toFASTAFormat() {
		StringBuffer FASTAFormat = new StringBuffer(">gb");
		
		// Format identifier and description
		if (accession != null)
			FASTAFormat.append("|" + accession);
		if (locus != null)
			FASTAFormat.append("|" + locus);
		if (description != null)
			FASTAFormat.append("|" + description);
		FASTAFormat.append('\n');
		
		// Append raw sequence, ensure each line stick to 80 characters
		if (rawSequence != null)
		{
			final int SEQ_LENGTH = rawSequence.length();
			final int LINE_SIZE = 80;
			int seqStart = 0;
			int seqEnd = SEQ_LENGTH > LINE_SIZE ? LINE_SIZE : SEQ_LENGTH;
			
			while (seqStart < seqEnd) {
				FASTAFormat.append(rawSequence.substring(seqStart, seqEnd));
				FASTAFormat.append('\n');
				seqStart = seqEnd;
				seqEnd += LINE_SIZE;
				if (seqEnd > SEQ_LENGTH)
					seqEnd = SEQ_LENGTH;
			};
		}
		return FASTAFormat.toString(); 
	}
}
