package pgm106Main;

import java.io.FileOutputStream;

public class Pgm106Main {
	public static void main(String args[]) {
		char y=' ';
		
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("Test");
			
			y=(char) System.in.read();
			while(y!='$') {
				fos.write(y);
				y=(char) System.in.read();
				
			}
			fos.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
