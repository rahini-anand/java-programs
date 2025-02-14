package pgm129;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Pgm129Main1 {
	public static void main(String args[]) {
		Person p,p1;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("Biodata");
			ois=new ObjectInputStream(fis);
			
			p=(Person) ois.readObject();
			//while(ois.available()>=0) {
				p.display();
				
				p1=(Person) ois.readObject();
				p1.display();
				
			//}
			
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
