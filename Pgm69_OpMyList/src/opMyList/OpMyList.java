package opMyList;

import myList.MyList;

public class OpMyList extends MyList {
	public OpMyList() {
		super();
	}
	
	public OpMyList(int n) {
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
		int min=1000;
		for(int i:a) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}
	
	public boolean find(int n) {
		boolean flag=true;
		flag=a.contains(n);
		return flag;
	}
	public int Index(int n) {
		int ind=-1;
		ind=a.indexOf(n);
		return ind;
	}
	public void remove(int n) {
		int ind=-1;
		ind=a.indexOf(n);
		if (ind!=-1) {
			a.remove(ind);
		}
		else {
			System.out.println("Value not found");
		}
	}
}
