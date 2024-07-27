package matrix;

public class Matrix {
	
	protected int a[][];
	
	public Matrix() {
		a=new int[][] {{1,2,1},{2,1,2},{3,1,3}};
	}
	
	public Matrix(int r,int c) {
		a=new int[r][c];
		for (int i=0;i<r;i++) {
			for (int j=0;j<c;j++) {
				a[i][j]=(int)(Math.random()*100);
			}
		}
		
	}
	
	public void display() {
		int row=a.length;
		int col=0;
		for (int[] i:a) {
			col=i.length;	
		}
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.println(a[i][j]);
			}
		}
	}
	
	public void displayEach() {
		for (int[] i:a) {
			for (int j:i) {
				System.out.println(j);
			}
		}
	}

}
