package person;

public class Person {
	private int age;
	private String name, address;
	private long mobile;
	
	
	public Person() {
		name="Kavin";
		age=4;
		address="No:10,Sundar nagar,Trichy";
		mobile=759864896;

	}
	
	public Person(String name,int age,String address,long mobile) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.mobile=mobile;
	}
	
	public void set_name(String name) {
		this.name=name;
	}
	
	public void set_age(int age) {
		this.age=age;
	}
	
	public void set_address(String address) {
		this.address=address;
	}
	
	public void set_mobile(long mobile) {
		this.mobile=mobile;
	}
	
	public String get_name() {
		return name;
	}
	
	public int get_age() {
		return age;
	}
	
	public String get_address() {
		return address;
	}
	
	public long get_mobile() {
		return mobile;
	}
	
	public void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("Address:"+address);
		System.out.println("mobile:"+mobile);
	}
	
	
	
	
}