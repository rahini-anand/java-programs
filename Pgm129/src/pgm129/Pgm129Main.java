package pgm129;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Pgm129Main {
	public static void main(String args[]) {
		String name=" ";
		String address=" ";
		int age=0;
		double salary=0;
		
		Scanner s=null;
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			s=new Scanner(System.in);
			fos=new FileOutputStream("Biodata");
			oos=new ObjectOutputStream(fos);
			
			Person p=new Person();
			
			name=s.nextLine();
			while(!(name.equals("Stop"))){
				age=s.nextInt();
				salary=s.nextDouble();
				address=s.nextLine();
				
				p.setName(name);
				p.setAge(age);
				p.setAddress(address);
				p.setSalary(salary);
				
				//p.display();
				
				oos.writeObject(p);
				
				name=s.nextLine();
				
			}
			
			fos.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
