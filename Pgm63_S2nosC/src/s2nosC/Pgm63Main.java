package s2nosC;

public class Pgm63Main {
	public static void main(String args[]) {
	S2nosC s=new S2nosC();
	S2nosC s1=new S2nosC(15,30);
	S2nosC s2=new S2nosC(s1);
	S2nosC s3=new S2nosC(40,80);
	S2nosC s4=new S2nosC(s2);
	S2nosC s5=new S2nosC();
	
	
	System.out.println("Count:"+S2nosC.count);
	}
}
