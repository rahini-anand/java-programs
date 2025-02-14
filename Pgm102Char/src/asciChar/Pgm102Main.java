package asciChar;

public class Pgm102Main {
	public static void main(String args[]) {
		int x=0;
		char y=' ';
		try {
			x=System.in.read();
			y=(char) x;
				
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(y);
		
		
	}

}
