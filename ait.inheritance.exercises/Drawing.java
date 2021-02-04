package ait.inheritance.exercises;

class Drawing extends Cartoon {
	
	Drawing() {
		System.out.println("DRAWING constructor");
	}
	
	public void sketch() {
		System.out.println("DRAWING: sketch()");
	}
	
	@Override
	public String toString() {
		return "DRAWING:toString()";
	}
}
