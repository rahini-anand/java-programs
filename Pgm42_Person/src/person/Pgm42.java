package person;
import person.Person;

public class Pgm42 {

	public static void main() {
		Person p,p1;
		p=new Person();
		p1=new Person("Nivin",2,"Trichy",04312457167);
		
		p.display();
		p1.display();
		
		p.set_name("Nivin");
		p.set_age(2);
		p.set_address("Bangalore");
		p.set_mobile(900338872);
		
		String n=p.get_name();
		int a=p.get_age();
		String ad=p.get_address();
		long m=p.get_mobile();
		
		System.out.println("name:"+n);
		System.out.println("Age:"+a);
		System.out.println("address:"+ad);
		System.out.println("mobile:"+m);
	}
}
