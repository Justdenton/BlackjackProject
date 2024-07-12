package com.skilldistillery.blackjack;

import java.util.ArrayList;

import com.skilldistillery.cardgames.common.AbstractHand;

public class BlackjackHand extends AbstractHand {
	
	// NO FIELDS
	
	public BlackjackHand() {
	
	}
	
	
	@Override
	public int getHandValue() {
		
		// Starts at 0.
		int combinedCardsTotal = 0;
		
		if (combinedCardsTotal % 1 == 2 && == 21) {
			System.out.println("TEST BLACKJACK");
		} else if (combinedCardsTotal < 21) {
			
		} else {
			
		}
		
		
		return 0;
	}
	
	
	
	public boolean isBlackjack() {
		
		return getHandValue() > 21;
		return true;
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

