package ait.hdip.cardsexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class CardGame {
	 private static final String[] suit = {"H", "C", "S", "D"};
	 private static final String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	 private static Card[] cards=new Card[52];
	 private static ArrayList<Player> players=new ArrayList<Player>();
	 static Scanner sc = new Scanner(System.in);
	 static int counter = 0;
	 
	 public static void main(String[] args) {
		 loadCardArray();
		 System.out.println("Printing the initialised Card Array.....");
		 printCardArray();
		 addPlayers();
		 shuffleCards();
		 System.out.println("Printing the shuffled Card Array");
		 printCardArray();
		 dealHands();
		 showHands();
		 checkForWinner();
	 }
	 
	 private static void loadCardArray() {
		
		 int i=0;
		 for(String suit: suit) {
			 for (String rank: rank) {
				 cards[i] = new Card(suit, rank);
				 i++;
			 }
		 }
	 }
	 
	 private static void printCardArray() {
		
		 int i=0;
		 for(String suit: suit) {
			 for(String rank: rank) {
				 System.out.print(cards[i].getCardRank().toString()+"-"+cards[i].getCardSuit().toString()+", ");
				 i++;
			 }
			 System.out.println();
		 }
}
	 
	 private static void addPlayers() {
		 
		
		String flag = "y";
		while (flag.equals("y")) {
		 System.out.println("Enter name for player "+(counter+1)+" :");
		 String name = sc.next();
		 Player player = new Player(name);
		 players.add(player);
		 System.out.println("Add another player? (y/n):");
		 flag = sc.next();
		 counter = counter + 1;
		}
		
		System.out.println("The following players have been added:\n");
		
		for(int i=0; i<players.size();i++) {
			System.out.println("Player"+(i+1)+" "+players.get(i).getName());
		}
	 }
	 
	 private static void dealHands() {
		
		 int cardIndex=0;
		 for (int i=0; i<players.size();i++) {
			 Card [] hand = {cards[cardIndex +(players.size() * (i))]};
			 players.get(i).setHand(hand);
			 cardIndex += 1;
		 }
	 }
	 
	 
	 private static void showHands() {
		 
		 System.out.println("Showing hands of cards for each player:\n ");
		 for(Player player: players) {
			 
				 System.out.println(player);
			 }
			 System.out.println();
	}
		 
	 
	 
	 private static void checkForWinner() {
		//TO DO
	 }
	 
	 private static void shuffleCards()
	 {
		 System.out.println("Shuffling Card Array...");
	     Card temp;
	     int index;
	     Random random = new Random();
	     for (int i = cards.length - 1; i > 0; i--)
	     {
	         index = random.nextInt(i + 1);
	         temp = cards[index];
	         cards[index] = cards[i];
	         cards[i] = temp;
	     }
	 }
}
