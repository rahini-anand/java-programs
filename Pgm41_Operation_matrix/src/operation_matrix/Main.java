package operation_matrix;

public class Main {
	public static void main(String args[]) {
		Operation_Matrix a,a1,a2;
		
		a=new Operation_Matrix();
		a1=new Operation_Matrix(3,3);
		a1=new Operation_Matrix(3,4);
		
		int s=a.sum();
		System.out.println("Sum:"+s);
		
		int s_r=a.sum_row(1);
		System.out.println("Sum_row:"+s_r);
		
		int s_c=a.sum_col(2);
		System.out.println("Sum_col:"+s_c);
		
		
		int b=a.big();
		System.out.println("big:"+b);
		
		int b_r=a.big_row(1);
		System.out.println("big_row:"+b_r);
		
		int b_c=a.big_col(2);
		System.out.println("big_col:"+b_c);
		
		int sm=a.small();
		System.out.println("Small:"+sm);
		
		int sm_r=a.small_row(1);
		System.out.println("Small_row:"+sm_r);
		
		int sm_c=a.small_col(2);
		System.out.println("Small_col:"+sm_c);
		
		boolean flag=a.find_presense(3);
		System.out.print("find:"+flag);
		
	}
}
