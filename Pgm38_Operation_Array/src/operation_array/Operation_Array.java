package operation_array;

import array.Array;
import oper_array.Oper_Array;

public class Operation_Array extends Array implements Oper_Array {
	
	public Operation_Array(int n) {
		super(n);
	}
	public int sum() {
		int sum=0;
		for (int i:a) {
			sum+=i;
		}
		return sum;
	}
	public int big() {
		int max=0;
		for (int i:a) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	public int small() {
		int min=10000;
		for (int i:a) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}
	public boolean find_presense(int n) {
		boolean flag=false;
		for (int i:a) {
			if(i==n) {
				flag=true;
			}
		}
		return flag;
	}
	public int index(int n) {
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				index=i;
			}
			
		}
		return index;
	}
}
