package pgm105;

public class Pgm105Main {
	public static void main(String args[]) {
		int u=0;
		int l=0;
		int d=0;
		int s=0;
		int x=0;
		char y=' ';
		
		try {
			x=System.in.read();
			y=(char) x;
			System.out.println(y);
			while(y!='$') {
				if(x>=65&&x<=90) 
					u+=1;
				else if(x>=97&&x<=122)
					l+=1;
				else if(x>=48&&x<=57)
					d+=1;
				else
					s+=1;
			
				x=System.in.read();
				y=(char) x;
				System.out.println(y);
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(u);
		System.out.println(l);
		System.out.println(d);
		System.out.println(s);
	}

}
