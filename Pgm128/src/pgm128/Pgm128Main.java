package pgm128;
import java.io.*;

public class Pgm128Main {
	public static void main(String args[]) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("Biodata");
			oos=new ObjectOutputStream(fos);
			
			Person p1=new Person("Kavin",5,"Trichy",9000);
			Person p2=new Person("Nivin",3,"Trichy",8000);
			Person p3=new Person("Anne",38,"Trichy",7000);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			fos.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
