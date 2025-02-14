package pgm108Main;

import java.io.FileInputStream;

public class Pgm108Main {
	public static void main(String args[]) {
		
		int x=0;
		int v=0;
		int c=0;
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("Test");
			x=fis.read();
			
			while(x!=-1) {
				char y=(char) x;
				if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
					v+=1;
				else
					c+=1;
				x=fis.read();
			}
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Vowels:");
		System.out.println(v);
		
		System.out.println("Consonants:");
		System.out.print(c);
	}

}
