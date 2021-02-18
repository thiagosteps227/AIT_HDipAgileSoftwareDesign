package cardDeckApp;

class Player {
	private String theName;
	public Card [] theHand = new Card[5];

	public Player(String theName, Card[] theHand) {
		this.theName = theName;
		this.theHand = theHand;

	}

	public Player() {
		super();
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public Card [] getTheHand() {
		return theHand;
	}

	public void setTheHand(Card [] theHand) {
		this.theHand = theHand;
	}

	@Override
	public String toString() {
		return "Player [theName=" + theName + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
