package pgm127;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Pgm127Read {
	public static void main(String args[]) {
		DataInputStream dis=null;
		FileInputStream fis=null;
	
	String name=" ";
	int age=0;
	double salary=0.0;
	String address=" ";
	
	try {
		
		fis=new FileInputStream("Biodata");
		dis=new DataInputStream(fis);
		
		name=dis.readUTF();
		while(dis.available()>=0) {
			age=dis.readInt();
			salary=dis.readDouble();
			address=dis.readUTF();
			
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Salary:"+salary);
			System.out.println("Address:"+address);
			
			name=dis.readUTF();
		}
		
		fis.close();	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	

	
	
	}
}
