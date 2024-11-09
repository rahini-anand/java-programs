package payrolls;

public class Pgm46Main {
	public static void main(String args[]) {
		
		Payrolls p,p1;
		p=new Payrolls();
		p1=new Payrolls("Aishwarya",41,"Trichy",722339988,444,"CS","Asst.Pro.",50000);
		
		
		double h=p.HRA();
		double d=p.DA();
		double e=p.EA();
		double ep=p.EPF();
		double m=p.MI();
		double pt=p.PT();
		
	
			System.out.println("Allowances");
			System.out.println("HRA:"+h);
			System.out.println("DA:"+d);
			System.out.println("EA:"+e);
			System.out.println("--------");
			System.out.println("Deducitons");
			System.out.println("EPF:"+ep);
			System.out.println("MI:"+m);
			System.out.println("DA:"+d);
			System.out.println("PT:"+pt);
			

		}
	
	}


