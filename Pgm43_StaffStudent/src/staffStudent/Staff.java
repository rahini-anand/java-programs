package staffStudent;

import person.Person;
public class Staff extends Person{
	
	private int stfNo;
	private String dept,designation;
	protected double salary;
	
	public Staff() {
		super();
		stfNo=1214;
		dept="Mathematics";
		designation="Asst. Professor";
		salary=50000;
	}
	
	public Staff(String n,int a,String ad,long mob,int sno,String dep,String des,double sal) {
		super(n,a,ad,mob);
		stfNo=sno;
		dept=dep;
		designation=des;
		salary=sal;
	}
	
	public void setStfNo(int s) {
		stfNo=s;
	}
	
	public void setDept(String dep) {
		dept=dep;
	}
	
	public void setDesignation(String des) {
		designation=des;
	}
	
	public void setSalary(double sal) {
		salary=sal;
	}
	
	public int getStfNo() {
		return stfNo;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void display() {
		super.display();
		System.out.println("StaffNo:"+stfNo);
		System.out.println("Department:"+dept);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);

	}
	
}
