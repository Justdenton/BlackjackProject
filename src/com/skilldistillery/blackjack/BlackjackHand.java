package com.skilldistillery.blackjack;

import com.skilldistillery.cardgames.common.AbstractHand;
import com.skilldistillery.cardgames.common.Card;

public class BlackjackHand extends AbstractHand {
    
	// NO FIELDS

	public BlackjackHand() {
        // (was missing super)
    	super();
    }
    
    @Override
    public int getHandValue() {
        
    	int totalValue = 0;
        int aceCount = 0;
        
        for (Card card : cardsInHand) {
            totalValue += card.getValue();
            if (card.getValue() == 11) {
                aceCount++;
            }
        }

        while (totalValue > 21 && aceCount > 0) {
            totalValue -= 10;
            aceCount--;
        }
        
        return totalValue;
    }
    
    public boolean isBlackjack() {
        return getHandValue() == 21 && cardsInHand.size() == 2;
    }
    
    public boolean isBust() {
        return getHandValue() > 21;
    }
    
    public Card getFirstCard() {
        if (cardsInHand.size() > 0) {
            return cardsInHand.get(0);
        }
        return null;
    }
    
    public int getNumberOfCards() {
        return cardsInHand.size();
    }
}

    /*
    // isHard & isSoft - OPTIONAL	
    public boolean isHard() {
    	
    	return true;
    }
    
    public boolean isSoft() {
    	
    	return true;
    }
    
}
*/
