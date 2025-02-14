package pgm124;

import java.io.*;

public class Pgm124Main {
	
	public static void main(String args[]) {
		
		DataInputStream dis=null;
		String name=" ";
		int age=0;
		double salary=0;
		String address=" ";
		
		try {
			dis=new DataInputStream(System.in);
			
			
			name=dis.readUTF();
			age=dis.readInt();
			salary=dis.readDouble();
			address=dis.readUTF();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Address:"+address);
	}

}
