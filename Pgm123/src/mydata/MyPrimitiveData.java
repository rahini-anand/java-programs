package mydata;

import java.io.*;

public class MyPrimitiveData{
	
	private String s;
	private InputStreamReader isr;
	private BufferedReader br;
	
	public MyPrimitiveData() {
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public int readInt() {
		int i=0;
		try {
			s=br.readLine();
			i=Integer.parseInt(s);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
	
	public float readFloat() {
		float f=0;
		try {
			s=br.readLine();
			f=Float.parseFloat(s);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return f;
	}
	public double readDouble() {
		double d=0;
		try {
			s=br.readLine();
			d=Double.parseDouble(s);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return d;
	}
	public long readLong() {
		long l=0;
		try {
			s=br.readLine();
			l=Long.parseLong(s);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}
	public boolean readBooelan() {
		boolean b=true;
		try {
			s=br.readLine();
			b=Boolean.parseBoolean(s);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

}
