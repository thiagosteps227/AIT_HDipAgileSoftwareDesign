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
		
		if(computer.equals(HP)) {
			eval = "This is good";
		} else if(computer.equals(DELL)) {
			eval = "Used Worldwide";
		} else if (computer.equals(APPLE)) {
			eval = "So expensive";
		}
		
		return "This is you computer and here is the review: " + eval;
	}
	
}
