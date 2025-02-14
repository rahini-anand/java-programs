package pgm109Main;

import java.io.FileInputStream;

public class Pgm109Main {
	public static void main(String args[]) {
		int x=0;
		int u=0;
		int l=0;
		int d=0;
		int s=0;
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("Test");
			x=fis.read();
			
			while(x!=-1) {
				if(x>=65&&x<=90)
					u+=1;
				else if(x>=97&&x<=122) 
					l+=1;
				else if(x>=48&&x<=57)
					d+=1;
				else
					s+=1;
				
				x=fis.read();
			}
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("upper:");
		System.out.println(u);
		System.out.println("lower:");
		System.out.println(l);
		System.out.println("digits:");
		System.out.println(d);
		System.out.println("Special Character:");
		System.out.println(s);
	}

}
