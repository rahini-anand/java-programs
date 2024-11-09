package staffStudent;


public class Pgm43Main {

	public static void main(String args[]) {
		Staff stf,stf1;
		Student st,st1;
		
		stf=new Staff();
		stf1=new Staff("Selvi",48,"chennai",957831090,1241,"History","HOD",80000);
		
		stf.display();
		System.out.println("-----");
		
		stf1.display();
		System.out.println("-----");
		
		stf.setStfNo(4244);
		stf.setDept("Chemistry");
		stf.setDesignation("Professor");
		stf.setSalary(70000);
		
		System.out.println("-----");

		int s=stf.getStfNo();
		String dep=stf.getDept();
		String des=stf.getDesignation();
		double sal=stf.getSalary();
		
		System.out.println("StaffNo:"+s);
		System.out.println("Department:"+dep);
		System.out.println("Designation:"+des);
		System.out.println("Salary:"+sal);
		
		System.out.println("-----");
		
		st=new Student();
		st1=new Student("Adhi",17,"Trichy",745689435,460,"B12","CS");
		
		
		st.display();
		System.out.println("-----");
		
		st1.display();
		System.out.println("-----");
		
		st.setRlNo(740);
		st.setDept("Chemistry");
		st.setSection("B2");
		
		System.out.println("-----");

		int r=st.getRlNo();
		String deps=st.getDept();
		String sec=st.getSection();
		
		System.out.println("RollNo:"+r);
		System.out.println("Department:"+deps);
		System.out.println("Section:"+sec);
	
		
		System.out.println("-----");
		
	}
}
