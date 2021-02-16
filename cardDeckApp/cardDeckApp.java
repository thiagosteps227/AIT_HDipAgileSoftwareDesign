package cardDeckApp;

import java.util.Scanner;

public class cardDeckApp {
	
	private static Scanner sc = new Scanner(System.in);
	private static String [] suits = {"H","C", "D", "S"};
	private static Card [] theDeck = new Card[52];
	private static Player [] players = new Player[5];

	public static void main(String[] args) {
		
		loadCardArray();
		//printCardArray();
		shuffleCards();
		//printCardArray();
		dealCards();
		showCards();
	}
	
	public static void loadCardArray() {
		
		int i=0;
		for(String suit: suits) {
			for(int j=1;j<=13;j++) {
					theDeck[i] = new Card(suit + j);
					i++;
			}
		}
	}
	
	public static void printCardArray() {
		
		int i=0;
		for(String suit: suits) {
			for(int j=1;j<=13;j++) {
				System.out.print(theDeck[i].toString()+" "); 
				i++;
			}
			System.out.println();	
		}
	}
	
	public static void shuffleCards() {
		for(int i=0;i<100;i++) {
			
			for (int j = 0; j<theDeck.length;j++) {
				int variant = (int) (Math.random()*50) + 1 ;
				if(variant + j < theDeck.length) {
					Card inTheDrawer = theDeck[j];
					theDeck[j] = theDeck[variant + j];
					theDeck[variant + j] = inTheDrawer;
				}
			}
		}
	}
	
	public static void dealCards() {
		
		int cardIndex =0;
		for (int i=0; i<4;i++) {
			System.out.print("Enter the player name: ");
			String playerName = sc.next();
			Card [] hand = {theDeck[cardIndex], 
					theDeck[cardIndex + (4 * 1)], 
					theDeck[cardIndex + (4 * 2)], 
					theDeck[cardIndex + (4 * 3)], 
					theDeck[cardIndex + (4 * 4)]};
			players[i] = new Player(playerName, hand);	
			cardIndex += 1;
		}
		
		System.out.println();
		
	}
	
	public static void showCards() {
		
		for(Player player: players) {
			for(Card card:player.getTheHand()) {
				System.out.println(player+" "+card);
			}
			System.out.println();
		}
	}
		
				
}
