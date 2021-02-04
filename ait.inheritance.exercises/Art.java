package ait.inheritance.exercises;

class Art extends Drawing{
	
	public Art(){
		System.out.println("ART constructor");
	}
	
	public void sketch() {
		System.out.println("ART: sketch()");
	}
	
	public String toString() {
		return "Art:toString()";
	}
}
