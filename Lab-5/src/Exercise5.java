import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence seq1 = new Sequence();
		
		TestException a = new TestException();
		a.manyExceptions();
	
		try {
			StringBuffer rawData = new StringBuffer();
			rawData.append(Files.readAllBytes(Paths.get("C:\\Oliver\\Projects\\SC\\Courses\\2019\\Assignment 1\\1k_Sample.txt")));
			seq1.setSequence(rawData.toString());
			seq1.testConcatenate("C:\\Oliver\\Projects\\SC\\Courses\\2019\\Assignment 1\\1k_Sample.txt", 2);
			System.out.println(TestException.tryWithResource("C:\\Olver\\Projects\\SC\\Courses\\2019\\Assignment 1\\1k_Sample.txt"));
			throw new MySequenceException(seq1);
		}
		catch (IOException ex) {
			System.out.println("Main: IOException is caught!");
			ex.printStackTrace(System.out);
		}
		catch (MySequenceException ex) {
			System.out.println("Main: MySequenceException is caught!");
			ex.printStackTrace(System.out);	
		}
		System.out.println("Main: After the catch block.");
		

		TrafficLight Finch_Keele = TrafficLight.RED;
		TrafficLight Yonge_Finch = TrafficLight.valueOf("YELLOW");
		String str_Yonge_Finch = TrafficLight.YELLOW.toString();
		
		for (TrafficLight x : TrafficLight.values()) {
			System.out.println(x);
		}
		
		System.out.println(Finch_Keele.getTrafficLightCode());
		
	}

}
