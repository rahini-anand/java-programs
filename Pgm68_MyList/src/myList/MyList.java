package myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class MyList {

	protected ArrayList <Integer> a;

	public MyList() {
		a=new ArrayList<Integer>();
		int n=20;
		for (int i=0;i<n;i++) {
			a.add((int)(Math.random()*100));
		}
	}
	public MyList(int n) {
		a=new ArrayList<Integer>();
		for (int i=0;i<n;i++) {
			//a.add((int)(Math.random()*100));
			a.add(i);
		}
	}
	public void display() {
		System.out.println(a);
	}
	public void dispEach() {
		for (Integer i:a) {
			System.out.println(i);
		}
	}
	public void dispInd() {
		int n=a.size();
		for (int i=0;i<n;i++) {
			int b=a.get(i);
			System.out.println(b);
		}
	}
	public void dispIter() {
		Iterator<Integer> itr; 
		itr=a.iterator();
		
		while(itr.hasNext()) {
			int b=itr.next();
			System.out.println(b);
		}
	}
	public void dispIterRev() {
		ListIterator <Integer> itr;
		int n=a.size();
		itr=a.listIterator(n);
		while(itr.hasPrevious()) {
			int b=itr.previous();
			System.out.println(b);
		}
	}
	public void IndexOfElement() {
		for (Integer i:a) {
			int b=a.indexOf(i);
			System.out.println(b);
			
		}
	}
}
