package ait.hdip.cardsexercise;

public class Player {
	private String name;
	Card[] hand=new Card[5];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHand(Card[] hand) {
		this.hand=hand;
	}
	public Card [] getHand() {
		return hand;
	}
	
	public boolean checkForAceOfHearts() {
		//TO DO
		//return true if the players hand contains the Ace of hearts, otherwise false
		//return true for compilation
		return true;
	}
	
	@Override
	public String toString() {
		String cards ="";
		
		for(int i=0;i<5;i++) {
			cards += hand[i].getCardRank()+" - "+hand[i].getCardSuit()+" ";
		}
		
		return "Hand of cards for "+name+" is "+ cards;		
		
	}
	
	

}
