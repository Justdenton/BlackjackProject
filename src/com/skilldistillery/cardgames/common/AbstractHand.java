package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
    
	// Protected field (ONLY)
    protected List<Card> cardsInHand;
    
    public AbstractHand() {
        
    	this.cardsInHand = new ArrayList<>();
    }
    
    public void addCard(Card card) {
        
    	cardsInHand.add(card);
    }
    
    public abstract int getHandValue();
    
    public void clear() {
        
    	cardsInHand.clear();
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Card card : cardsInHand) {
            sb.append(card).append(", ");
        }
        
        // Remove comma here, not in for loop.
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        
        return sb.toString();
        
    }
    
}

