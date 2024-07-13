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
		
		// *************************************************************************
		player.addCardToHand(dealer.dealCard()); // UP
		dealer.addCardToHand(dealer.dealCard()); // DOWN
		
		// *************************************************************************
		player.addCardToHand(dealer.dealCard()); // UP
		dealer.addCardToHand(dealer.dealCard()); // UP
		
		// *************************************************************************
		//System.out.println("Players Hand: ");
		//player.getHandValue();
		System.out.println(player.toString());
		System.out.println(dealer.toString());
		
		System.out.println();
	
		dealer.displayHand();
		
		
		
		// *************************************************************************
		// 
		if (player.isBlackjack()) {
			System.out.println("\n BLACKJACK! Player wins!");
			scanner.close();
			return;
		}
		// *************************************************************************
		// If player didn't get a blackjack: 
		boolean playerTurn = true;
		System.out.println("Enter your choice, HIT or STAND: ");
		String playerChoice = scanner.next();
		
		if (playerChoice.equalsIgnoreCase("hit")) {
			player.addCardToHand(dealer.dealCard());
			//System.out.println("Player's Hand: ");
			player.getHandValue();
			
			player.displayHand();
		} if (player.isBust()) {
			
		}
		
		
		// *************************************************************************
		// Dealer continues to HIT until >= 17
		while (dealer.getHandValue() < 17) {
			dealer.addCardToHand(dealer.dealCard());
			if (dealer.getHandValue() > 21) {
				dealer.isBust();
			
			}
		}
		
		
		
		// *************************************************************************
		// Dealer would need to have >=17
		if (player.getHandValue() > dealer.getHandValue()) {
			System.out.println("\n Player wins!");
		} else {
			System.out.println("\n Dealer wins!");
		}
		
		
		
		
		
	}

	
	
	
	
}
