package person1;
import java.util.ArrayList;
import java.util.LinkedList;

public class Pgm70Main {
	public static void main(String args[]) {
	
	ArrayList <Person1> a=new ArrayList<Person1>();
	
	Person1 p,p1,p2,p3,p4;
	
	p=new Person1();
	p1=new Person1("Nivin",2,"Trichy",900338872);
	p2=new Person1("Joshika",5,"Chennai",900339003);
	p3=new Person1("Yeshwanth",10,"Chennai",755017550);
	p4=new Person1("Joshua",4,"Trichy",959697989);
	
	a.add(p);
	a.add(p1);
	a.add(p2);
	a.add(p3);
	a.add(p4);
	
	for(Person1 i:a) {
		String n=i.get_name();
		long m=i.get_mobile();
		System.out.println("Name:"+n);
		System.out.println("Mobile:"+m);
	}
	
	System.out.println("____________________________");
	
	LinkedList <Person1> l=new LinkedList<Person1>();
	
	
	l.add(p);
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	
	for(Person1 x:l) {
		x.display();
	}
	
	}
	
}
