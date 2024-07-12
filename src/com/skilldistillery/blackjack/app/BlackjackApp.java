package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.Dealer;
import com.skilldistillery.blackjack.Player;

public class BlackjackApp {

	// NO List<Cards>
	// NO Deck
	
	private Player player = new Player();
	private Dealer dealer = new Dealer();
	// Stretch Goal - ArrayList of players.
	// Table Class (idea) 
	
	public static void main(String[] args) {

		BlackjackApp app = new BlackjackApp();
		app.run();
	}
	
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		dealer.shuffleDeck();
		
		player.addCardToHand(dealer.dealCard()); // UP
		dealer.addCardToHand(dealer.dealCard()); // DOWN
		
		player.addCardToHand(dealer.dealCard()); // UP
		dealer.addCardToHand(dealer.dealCard()); // UP
		
		System.out.println("Players Hand: " + player.displayHand());
		player.displayHand();
		
		System.out.println("Dealer's Hand: " + dealer.displayHand());
		dealer.displayHand();
		
		
		
		
		if (player.isBlackjack()) {
			System.out.println("TEST BLACKJACK");
		}
		
		// Dealer continues to HIT until >= 17
		while (dealer.getHandValue() < 17) {
			dealer.addCardToHand(dealer.dealCard());
		}
		
		
		
		// Dealer would need to have >=17
		if (player.getHandValue() > dealer.getHandValue()) {
			System.out.println("Player wins!");
		} else {
			System.out.println("Dealer wins!");
		}
		
		
		
		
		
	}

	
	
	
	
}
