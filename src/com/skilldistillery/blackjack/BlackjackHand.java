package com.skilldistillery.blackjack;

import com.skilldistillery.cardgames.common.AbstractHand;
import com.skilldistillery.cardgames.common.Card;

public class BlackjackHand extends AbstractHand {
	
	// NO FIELDS
	
	public BlackjackHand() {
	
	}
	
	@Override
	public int getHandValue() {
		
		// Starts at 0.
		int combinedCardsTotal = 0;
		
		for (Card card : cardsInHand) {

			combinedCardsTotal += card.getValue();
		
		}
		return combinedCardsTotal;
		
	}
	
	public boolean isBlackjack() {
		
		return getHandValue() == 21 && cardsInHand.size() == 2;
	}
	
	public boolean isBust() {
		
		return getHandValue() > 21;
	}
	
// isHard & isSoft - OPTIONAL	
	public boolean isHard() {
		
		return true;
	}
	
	public boolean isSoft() {
		
		return true;
	}

}

