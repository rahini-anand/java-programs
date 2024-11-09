package staffStudent;

import person.Person;
public class Student extends Person{
	private int rlNo;
	private String dept,section;
	
	public Student() {
		super();
		rlNo=451;
		dept="Mathematics";
		section="A1";
	}
	
	public Student(String n,int a,String ad,long mob,int rno,String dep,String sec) {
		super(n,a,ad,mob);
		rlNo=rno;
		dept=dep;
		section=sec;
	}
	
	public void setRlNo(int r) {
		rlNo=r;
	}
	
	public void setDept(String dep) {
		dept=dep;
	}
	
	public void setSection(String sec) {
		section=sec;
	}
	
	public int getRlNo() {
		return rlNo;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getSection() {
		return section;
	}
		
	public void display() {
		super.display();
		System.out.println("RollNo:"+rlNo);
		System.out.println("Department:"+dept);
		System.out.println("Section:"+section);
		
	}
	

}
