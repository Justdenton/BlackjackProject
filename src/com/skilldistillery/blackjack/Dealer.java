package com.skilldistillery.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player {

	// DO NOT ADD A getDeck();
	
	// Dealer "IS-A" player.
	// Dealer HAS-A (1) hand (2) deck.
	
	// Don't need to add a new hand, already has a hand (Dealer extends Player)
    
    private Deck deck;
    
    public Dealer() {
        super();
        this.deck = new Deck();
    }
    
    // Dealer specific behaviors BELOW:
    public Card dealCard() {
        return deck.dealCard();
    }
    
    public void shuffleDeck() {
        deck.shuffle();
    }
    // Face up / face down. (specific to dealer)
    public String displayPartialHand() {
        Card firstCard = super.getHand().getFirstCard();
        
        if (firstCard != null && super.getHand().getNumberOfCards() > 1) {
            
        	return "Dealer showing: " + firstCard;
        }
        
        return "Dealer showing: " + firstCard;
    }
    
    @Override
    public String toString() {
        return "Dealer hand: " + super.displayHand();
    }
    
}
