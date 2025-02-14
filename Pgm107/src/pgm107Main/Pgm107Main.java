package pgm107Main;

import java.io.FileInputStream;

public class Pgm107Main {
	public static void main(String args[]) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("Test");
			int x=0;
			char y=' ';
			x=fis.read();
			while(x!=-1) {
				y=(char) x;
				System.out.print(y);
				x=fis.read();
			}
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
