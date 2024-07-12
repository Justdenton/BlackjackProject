package com.skilldistillery.blackjack;

import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player {
	
	// DO NOT ADD A getDeck();
	
	// Dealer "IS-A" player.
	// Dealer HAS-A (1) hand (2) deck.
	
	// Don't need to add a new hand, already has a hand (Dealer extends Player)
	// Dealer needs deck.
	
	private Deck deck = new Deck();
	
	public Dealer() {
		super();
		deck = new Deck(); // New deck instance.
	}
	
	
	// Dealer specific behaviors.
		// dealCard();
	
	public Card dealCard() {
		return deck.drawCard();
	}
	

}
