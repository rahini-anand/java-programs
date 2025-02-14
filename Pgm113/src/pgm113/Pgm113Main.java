package pgm113;

import java.io.*;

public class Pgm113Main {
	public static void main(String args[]) {
		int x=0;
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("Test");
			fos=new FileOutputStream("FlipTest");
			
			x=fis.read();
			while(x!=-1) {
				if(x>=65&&x<=90) 
					x+=32;
				else if(x>=97&&x<=122) 
					x-=32;
				fos.write(x);
				x=fis.read();
				
			}
				fis.close();
				fos.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
