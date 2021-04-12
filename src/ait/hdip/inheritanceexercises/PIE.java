package ait.hdip.inheritanceexercises;

public class PIE {

	public static void main(String[] args) {
		
		//Human h = new Human();
		//System.out.println(h);
		//Male m = (Male) h;
		//System.out.println(h);
		//Female f = (Female) h;
		//System.out.println(h);
		//Boy b = (Boy) h;
		
		//Male m = (Male) new Human();
		
		//Boy b = new Boy();
		//System.out.println(b.show());
		
		Male m = new Male();
		Female f = new Female();
		Boy b = new Boy();
		Girl g = new Girl();
		Man man = new Man();
		Woman w = new Woman();
		
		doSomething(new Human());
		doSomething(f);
		
	}
	
	public static void doSomething(Human h) {
	}
}
