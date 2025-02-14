package pgm112;
import java.io.*;

public class Pgm112Main {
	public static void main(String args[]) {
		int x=0;
		int y=0;
		FileInputStream fis1=null;
		FileInputStream fis2=null;
		FileOutputStream fos=null;
		
		try {
			fis1=new FileInputStream("Test");
			fis2=new FileInputStream("CopyTest");
			fos=new FileOutputStream("MergeFile");
			
			x=fis1.read();
			while(x!=-1) {
				fos.write(x);
				x=fis1.read();
			}
			
			y=fis2.read();
			while(y!=-1) {
				fos.write(y);
				y=fis2.read();
			}
			fis1.close();
			fis2.close();
			fos.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
