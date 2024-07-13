package com.skilldistillery.blackjack;

import com.skilldistillery.cardgames.common.Card;

public class Player {
	
	// Player HAS-A hand.
	
	// NO List<Card>
	// DO NOT ADD A getHand();
	
	private BlackjackHand hand;
	
	public Player() {
		this.hand = new BlackjackHand();
	}
	
	public void addCardToHand(Card card) {
		hand.addCard(card);
		// Dealer > Player > Hand
	}

	public int getHandValue() {
		return hand.getHandValue();
	}
	
	public int displayHand() {
		return hand.getHandValue();
		//System.out.println(hand);
	}
	
	public boolean isBlackjack() {
		return hand.isBlackjack();
	}
	
	public boolean isBust() {
		return hand.isBust();
	}

	@Override
	public String toString() {
		//return "Player hand: " + displayHand() + hand;
		return "Player dealt: \n" + hand + "\nPlayer hand: " + displayHand();
	}
	
	
	
	
}
