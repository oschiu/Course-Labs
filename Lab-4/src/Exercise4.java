import Lab4Package.Sequence;
import Lab4Package.GenBankSequence;
import Lab4Package.Blast;
import Lab4Interfaces.IShape;
import Lab4Inheritance.Shape;
import Lab4Factory.*;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence mySeq = new GenBankSequence();
		GenBankSequence myGBSeq = (GenBankSequence) mySeq;
		
		mySeq.description = "Call Super-class to set description";
		myGBSeq.description = "Call Subclass to set description";
		System.out.println("Method invoke: " + mySeq.getDescription() + "/" + 
												myGBSeq.getDescription());
		System.out.println("Variable access: " + mySeq.description + "/" + 
												 myGBSeq.description);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		System.out.println("---------------------------------------------------------------------------------------");
		myGBSeq.setRawSequence("1ATCGATCG01ATCGATCG11ATCGATCG21ATCGATCG31ATCGATCG4" +
								"1ATCGATCG51ATCGATCG61ATCGATCG71ATCGATCG81ATCGATCG9" +
								"2ATCGATCG02ATCGATCG12ATCGATCG22ATCGATCG32ATCGATCG4" +
								"2ATCGATCG52ATCGATCG62ATCGATCG72ATCGATCG82ATCGATCG9");
		System.out.println(myGBSeq.toFASTAFormat());
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		System.out.println("---------------------------------------------------------------------------------------");
		Sequence mySeq2 = new Sequence();
		Blast<Sequence> local = new Blast<>(mySeq2);
		local.align(myGBSeq);
		
		//~ Using Interface ~~~~~~~~~~~~~~~~~
		System.out.println("---------------------------------------------------------------------------------------");
		for (int i=0; i < 3; i++)
		{ 
			IShape randomShape = IShapeFactory.getShape();
			if (randomShape != null) {
				randomShape.draw();
				randomShape.area();
			}
		}
		
		//~ Using Inheritance ~~~~~~~~~~~~~~~~~
		System.out.println("---------------------------------------------------------------------------------------");
		for (int i=0; i < 3; i++)
		{
			Shape randomShape = ShapeFactory.getShape();
			if (randomShape != null) {
				randomShape.draw();
				randomShape.area();
			}
		}	
		
	}

}
