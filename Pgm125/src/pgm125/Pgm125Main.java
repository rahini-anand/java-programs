package pgm125;

import java.util.Scanner;

public class Pgm125Main {
	public static void main(String args[]) {
		Scanner s=null;
		
		String name=" ";
		int age=0;
		double salary=0.0;
		String address=" ";
		
		try {
			s=new Scanner(System.in);
			
			name=s.nextLine();
			age=s.nextInt();
			salary=s.nextDouble();
			address=s.nextLine();
				
		}
		catch(Exception e) {
			System.out.println(e);
		}
		s.close();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Address:"+address);
	}
	
	

}
