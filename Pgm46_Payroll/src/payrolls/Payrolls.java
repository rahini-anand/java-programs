package payrolls;


import person.Person;
import staffStudent.Staff;
import allowance.Allowance;
import deductions.Deductions;

public class Payrolls extends Staff implements Allowance,Deductions {
	
	public Payrolls() {
		super();
	}
	
	public Payrolls(String n,int a,String ad,long mob,int s,String d,String des,double sal) {
		super(n,a,ad,mob,s,d,des,sal);
	}
	
	public double HRA() {
		double h=salary*0.4f;
		return h;
	}
	
	public double DA() {
		double d=salary*0.5f;
		return d;
	}
	public double EA() {
		double e=salary*0.1f;
		return e;
	}
	
	public double EPF() {
		double ep=salary*0.07f;
		return ep;
	}
	
	public double MI() {
		double m=salary*0.02f;
		return m;
	}
	public double PT() {
		double p=salary*0.01f;
		return p;
	}
	
	
}
