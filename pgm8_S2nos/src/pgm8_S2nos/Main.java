package pgm8_S2nos;

public class Main {
	public static void main(String args[]) {
		
		S2Nos s1=new S2Nos();
		S2Nos s2=new S2Nos(5);
		S2Nos s3=new S2Nos(2,4);
		S2Nos s4=new S2Nos(s1);
		
		s1.find();
		s1.display();
		
		s2.find();
		s2.display();
		
		s3.find();
		s3.display();
		
		s4.find();
		s4.display();
		
	}
}
