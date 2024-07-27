package operation_matrix;


import matrix.Matrix;
import oper_matrix.Oper_Matrix;

public class Operation_Matrix extends Matrix implements Oper_Matrix {
	
	public Operation_Matrix() {
		super();
	}
	
	public Operation_Matrix(int r, int c) {
		super(r,c);
	}
	
	public int sum() {
		int s=0;
		for (int[] i:a) {
			for (int j:i) {
				s+=j;
			}
		}
		return s;
	}
	public int sum_row(int n) {
		int s=0;
		int row=n;
		int col=a[0].length;
		for (int j=0;j<col;j++) {
			s+=a[row][j];
		}
		return s;
	}
	public int sum_col(int n) {
		int s=0;
		int row=a.length;
		int col=n;
		for (int i=0;i<row;i++) {
			s+=a[i][col];
		}
		return s;
	}
	public int big(){
		int max=0;
		for(int[] i:a) {
			for (int j:i) {
				if(j>max) {
					max=j;
				}
			}
		}
		return max;
	}
	public int big_row(int n) {
		int max=0;
		int row=n;
		int col=a[0].length;
		for (int j=0;j<col;j++) {
			if(a[row][j]>max) {
				max=a[row][j];
			}
		}
		return max;
	}
	public int big_col(int n) {
		int max=0;
		int row=a.length;
		int col=n;
		for (int i=0;i<row;i++) {
			if(a[i][col]>max) {
				max=a[i][col];
			}
		}
		return max;
	}
	public int small() {
		int min=10000;
		for(int[] i:a) {
			for (int j:i) {
				if(j<min) {
					min=j;
				}
			}
		}
		return min;
	}
	public int small_row(int n) {
		int min=100000;
		int row=n;
		int col=a[0].length;
		for (int j=0;j<col;j++) {
			if(a[row][j]<min) {
				min=a[row][j];
			}
		}
		return min;
	}
	public int small_col(int n) {
		int min=10000;
		int row=a.length;
		int col=n;
		for (int i=0;i<row;i++) {
			if(a[i][col]<min) {
				min=a[i][col];
			}
		}
		return min;
	}
	public boolean find_presense(int n) {
		boolean flag=false;
		for(int[] i:a) {
			for (int j:i) {
				if(j==n) {
					flag=true;
				}
			}
		}
		return flag;
	}
	
	
}
