package op2nosExt;

import op2nosAdapter.Op2nosAdapter;
public class Op2nosExt extends Op2nosAdapter {
	
	protected int x,y;
	public Op2nosExt() {
		x=10;
		y=20;	
	}
	
	public Op2nosExt(int a,int b) {
		x=a;
		y=b;
	}
	
	public int sum() {
		int s=x+y;
		return s;
	}

}
