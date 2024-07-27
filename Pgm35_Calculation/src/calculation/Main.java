package calculation;

import java.util.Arrays;

//public class Main {
//
//	public static void main(String args[]) {
//		Calculation c=new Calculation();
//		
//		int s=c.sum();
//		int p=c.product();
//		int d=c.division();
//		int m=c.modulus();
//		int b=c.big();
//		int sm=c.small();
//		
//		System.out.println("sum:"+s);
//		System.out.println("Product:"+p);
//		System.out.println("Divison:"+d);
//		System.out.println("Modulus:"+m);
//		System.out.println("Big:"+b);
//		System.out.println("Small:"+sm);
//		
//		
//	}
//}



class Main {
    public static void main(String[] args) {
        String[] d = {"Ooty", "Bali","Thailand"};
       TravelAgency t1 = new TravelAgency("RoamWorld", d);
       TravelAgency t2 = new TravelAgency(t1);
       t2.name="ValleyTravel";
       t2.destinations[0]="Goa";
       System.out.println(t1.name+" "+t1.destinations[0]);
    System.out.println(t2.name+" "+t2.destinations[0]);

    }
}

class TravelAgency {
    String name;
    String[] destinations;
    
    public TravelAgency(String n, String[] d) {
        name = n;
        destinations = d;
    }
    
    public TravelAgency(TravelAgency t) {
        this.name = t.name;
       this.destinations = t.destinations.clone();
    }
    
    
}