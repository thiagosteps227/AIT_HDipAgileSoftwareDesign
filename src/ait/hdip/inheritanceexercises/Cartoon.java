package ait.hdip.inheritanceexercises;

public class Cartoon extends Drawing{

	public Cartoon() {
		System.out.println("CARTOON constructor");
	}
	
	public void sketch() {
		System.out.println("CARTOON : sketch()");
	}
	
	public void tomAndJerry() {
		System.out.println("CARTOON: tomAndJerry()");
	}

	public static void main(String[] args) {
		
		//Cartoon c = new Cartoon();
		//Art a = new Art();
		//Drawing d = new Drawing();
		//c.sketchIt(a);
		//c.sketchIt(d);
		//c.sketchIt(c);
		//upcasting();
		downcasting();
		
	}
	
	public void sketchIt(Art a) {
		sketch();
		tomAndJerry();
	}
	
	public static void upcasting() {
		//Art a1 = new Art();
		//System.out.println(a1);
		//Art a2 = new Drawing();
		//System.out.println(a2);
		//Art a3 = new Cartoon();
		//System.out.println(a3);
		//Drawing d1 = new Drawing();
		//System.out.println(d1);
		//Drawing d2 = new Cartoon();
		//System.out.println(d2);
		//Cartoon c1 = new Cartoon();
		//System.out.println(c1);
	}
	
	public static void downcasting() {
		//Art a1 = new Drawing();
		//Drawing d1 = (Drawing) a1;
		//System.out.println(d1);
		//Art a2 = new Cartoon();
		//Drawing d2 = (Drawing) a2;
		//System.out.println(d2);
		//Cartoon c1 = (Cartoon) a2;
		//System.out.println(c1);
		
		//Drawing d3 = new Cartoon();
		//Cartoon c2 = (Cartoon) d3;
		//System.out.println(c2);
		
		//Drawing d4 = (Drawing) new Art();
		//Cartoon c3 = (Cartoon) new Art();
		Cartoon c4 = (Cartoon) new Drawing();
 	}
}


