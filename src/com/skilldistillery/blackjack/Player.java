package com.skilldistillery.blackjack;

import com.skilldistillery.cardgames.common.Card;

public class Player {
    
	// Player HAS-A hand.
	
	// NO List<Card>
	// DO NOT ADD A getHand();
	// How to send hand to Dealer? ***
	
    private BlackjackHand hand;
    
    public Player() {
        this.hand = new BlackjackHand();
    }
    
    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public int getHandValue() {
        return hand.getHandValue();
    }
    
    public String displayHand() {
        return hand.toString() + "\nValue: " + getHandValue();
    }
    
    public boolean isBlackjack() {
        return hand.isBlackjack();
    }
    
    public boolean isBust() {
        return hand.isBust();
    }
    
    public BlackjackHand getHand() {
        return this.hand;
    }

    @Override
    public String toString() {
        return "Player hand: " + displayHand();
    }
    
}
