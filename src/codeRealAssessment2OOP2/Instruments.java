package ie.ait.codeRealAssessment2OOP2;

// Instructions:

// 1 - Each of the methods should return or print the class name and the method name
// 2 - For example: play() in Strings should print "Strings::play()"
// 3 - for example: what() in Instruments should return class name "Instruments"
// 4 - There is no need to code any constructor
// 5 - Each sub class must have the play, what, and adjust methods

public class Instruments {	
	
	public void play() {
		System.out.println("Instruments::play()");
	}
	public String what() {
		return "Instruments";
	}
	public void adjust() {
		System.out.println("Instruments::adjust()");
	}
}

class Woodwinds extends Instruments{
	
	@Override
	public void play() {
		System.out.println("Instruments::Woodwinds()");
	}
	@Override
	public String what() {
		return "Woodwinds";
	}
	@Override
	public void adjust() {
		System.out.println("Woodwinds::adjust()");
	}
}

class Brass extends Instruments{
	
	@Override
	public void play() {
		System.out.println("Brass::play()");
	}
	@Override
	public String what() {
		return "Brass";
	}
	@Override
	public void adjust() {
		System.out.println("Brass::adjust()");
	}
}

class Strings extends Instruments{
	
	@Override
	public void play() {
		System.out.println("Strings::play()");
	}
	@Override
	public String what() {
		return "Strings";
	}
	@Override
	public void adjust() {
		System.out.println("Strings::adjust()");
	}
}

class Flutes extends Woodwinds{
	
	@Override
	public void play() {
		System.out.println("Flutes::play()");
	}
	@Override
	public String what() {
		return "Flutes";
	}
	@Override
	public void adjust() {
		System.out.println("Flutes::adjust()");
	}
}

class Trumpets extends Brass{	
	
	@Override
	public void play() {
		System.out.println("Trumpets::play()");
	}
	@Override
	public String what() {
		return "Trumpets";
	}
	@Override
	public void adjust() {
		System.out.println("Trumpets::adjust()");
	}
}

class Violins extends Strings{
	
	@Override
	public void play() {
		System.out.println("Violins::play()");
	}
	@Override
	public String what() {
		return "Violins";
	}
	@Override
	public void adjust() {
		System.out.println("Violins::adjust()");
	}
}
