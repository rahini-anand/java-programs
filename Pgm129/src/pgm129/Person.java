package pgm129;
import java.io.Serializable;

public class Person implements Serializable{
	private String name,address;
	private int age;
	private double salary;
	
	public Person() {
		name="";
		age=0;
		address="";
		salary=0;
	}
	public void setName(String n) {
		name=n;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setAddress(String ad) {
		address=ad;
	}
	public void setSalary(double sa) {
		salary=sa;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public double getSalary() {
		return salary;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
	}
}
