package ait.hdip.codeassessment2oop2;

public enum Computer {
	
	HP("This is good"),
	DELL("Used worldwide"),
	APPLE("So expensive");
	
	String computer;

	Computer(String stringC) {
		this.computer = stringC;
	}
	
	@Override
	public String toString() {
		
		String eval = "";
		
		if(this.equals(HP)) {
			eval = "This is good";
		} else if(this.equals(DELL)) {
			eval = "Used Worldwide";
		} else if (this.equals(APPLE)) {
			eval = "So expensive";
		}
		
		return "This is you computer and here is the review: " + eval;
		//thiago solution: "This is you computer and here is the review: " + computer
	}
	
}
