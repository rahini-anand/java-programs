package pgm128;

import java.io.*;

public class PGm128Main1 {
	public static void main(String args[]) {
		Person p1,p2,p3;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("Biodata");
			ois=new ObjectInputStream(fis);
			
			p1=(Person) ois.readObject();
			p2=(Person) ois.readObject();
			p3=(Person) ois.readObject();
			
			p1.display();
			p2.display();
			p3.display();
			
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
