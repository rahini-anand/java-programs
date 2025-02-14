package pgm110Main;

import java.io.FileInputStream;

public class Pgm110Main {
	public static void main(String args[]) {
		int x=0;
		char y=' ';
		int c=0;
		int l=0;
		int w=0;
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("Test");
			x=fis.read();
			
			while(x!=-1) {
				y=(char) x;
				c+=1;
				if(y==' ') {
					w+=1;
				}
				else if(y=='\n') {
					l+=1;
				}
				x=fis.read();
			}
			if(c!=0) {
				l+=1;
				w+=1;
			}
			
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Characters:");
		System.out.println(c);
		System.out.println("words:");
		System.out.println(w);
		System.out.println("Lines:");
		System.out.println(l);
	}

}
