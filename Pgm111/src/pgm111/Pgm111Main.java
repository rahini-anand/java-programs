package pgm111;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Pgm111Main {
	public static void main(String args[]) {
		
		int x=0;
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("Test");
			fos=new FileOutputStream("CopyTest");
			
			x=fis.read();
			while(x!=-1) {
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
