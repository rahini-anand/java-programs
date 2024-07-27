package calculation;

import a2nos1.A2Nos1;
import arithmetic_oper.Arithmetic_oper;
import comparison_oper.Comparison_oper;
public class Calculation extends A2Nos1 implements 
				Arithmetic_oper, Comparison_oper{

	
	public Calculation() {
		super();
	}
	
	public int sum() {
		int s=x+y;
		return s;
	}
	
	public int product() {
		int p=x*y;
		return p;
	}
	public int division() {
		int div=x/y;
		return div;
	}
	public int modulus() {
		int m=x%y;
		return m;
	}
	public int big() {
		int big=x>y?x:y;
		return big;
	}
	public int small() {
		int small=x<y?x:y;
		return small;
	}
}
