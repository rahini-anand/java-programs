package array;

public class Array {
	protected int a[];
	
	public Array(){
		a=new int[] {1,2,5,7,9,3,4,0,6,8};
	}
	
	public Array(int n) {
		a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=(int)(Math.random()*100);
		}
		
	}
	
	public void display(){
		int len=a.length;
		
		for (int i=0;i<len;i++) {
			System.out.println(a[i]);
		}
	}
	
	public void displayEach() {
		for (int i:a) {
			System.out.println(i);
		}
	}
	
		
}
