package com.skilldistillery.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player {
	
	// DO NOT ADD A getDeck();
	
	// Dealer "IS-A" player.
	// Dealer HAS-A (1) hand (2) deck.
	
	// Don't need to add a new hand, already has a hand (Dealer extends Player)
	
	private Deck deck = new Deck();
	
	public Dealer() {
		super();
		deck.shuffle();
	}
	
	// Dealer specific behaviors BELOW:
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	public void shuffleDeck() {
		deck.shuffle();
	}

	// First card - face down, second card - face up. 
	@Override
	public String toString() {
		return "Dealer showing: " ;
		//return "Player dealt: \n" + hand + "\nPlayer hand: " + displayHand();
		
	}
	
}
