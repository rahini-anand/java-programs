package pgm104;

public class Pgm104Main {
	public static void main(String args[]) {
		int v=0;
		int c=0;
		char y=' ';
		
		try {
			y=(char) System.in.read();
			System.out.println(y);
			while(y!='$') {
				if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
					v+=1;
				else 
					c+=1;
				
				y=(char) System.in.read();
				System.out.println(y);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(v);
		System.out.println(c);
				
	}

}
