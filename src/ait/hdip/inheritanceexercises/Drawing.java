package ait.hdip.inheritanceexercises;

public class Drawing extends Art {
	
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
