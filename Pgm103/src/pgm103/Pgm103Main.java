package pgm103;

public class Pgm103Main {
	public static void main(String args[]) {
		char y=' ';
		try {
			y=(char) System.in.read();
			while(y!='$') {
				System.out.println(y);
				y=(char) System.in.read();
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
