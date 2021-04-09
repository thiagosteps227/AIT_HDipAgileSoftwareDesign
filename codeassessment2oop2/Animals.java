package ait.hdip.codeassessment2oop2;

import java.util.*;

public class Animals {	
	
	protected Animals() {
		System.out.println("Animal");
	}
	
	public void sound() {
		System.out.println("Animal::sound()");
	}
	@Override
	public String toString() {
		return "This is an animal";
	}
}

class Dog extends Animals{
	
	public Dog() {
		System.out.println("Dog");
	}
	@Override
	public void sound() {
		System.out.println("Dog::sound()");
	}
	@Override
	public String toString() {
		return "This is a Dog";
	}
}

class Bulldog extends Dog{	
	
	public Bulldog() {
		System.out.println("Bulldog");
	}	
	@Override
	public void sound() {
		System.out.println("Bulldog::sound()");
	}
	@Override
	public String toString() {
		return "This is a Bulldog";
	}
}

class Poodle extends Dog{	
	
	public Poodle() {
		System.out.println("Poodle");
	}
	@Override
	public void sound() {
		System.out.println("Poodle::sound()");
	}
	@Override
	public String toString() {
		return "This is a Poodle";
	}
}

class Cat extends Animals{
	
	public Cat() {
		System.out.println("Cat");
	}
	@Override
	public void sound() {
		System.out.println("Cat::sound()");
	}
	@Override
	public String toString() {
		return "This is a Cat";
	}
}

