package pgm127;

import java.io.*;
import java.util.Scanner;

public class Pgm127Write {
	public static void main(String args[]) {
		
		Scanner s=null;
		DataOutputStream dos=null;
		FileOutputStream fos=null;
	
	String name=" ";
	int age=0;
	double salary=0.0;
	String address=" ";
	
	try {
		s=new Scanner(System.in);
		fos=new FileOutputStream("Biodata");
		dos=new DataOutputStream(fos);
		
		name=s.nextLine();
		while(!(name.equals("Stop"))) {
			age=s.nextInt();
			salary=s.nextDouble();
			address=s.nextLine();
		
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(salary);
			dos.writeUTF(address);
			
			name=s.nextLine();
		}
			
	}
	catch(Exception e) {
		System.out.println(e);
	}
	s.close();
	}
}
