
interface MiniSequence {
	public void printMini();
}

public class Exercise5Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MiniSequence x = new MiniSequence() {
			
			public void printMini() {
				System.out.println("This is the inner class;");
			}
		};
		x.printMini();
	}
}
