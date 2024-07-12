package com.skilldistillery.blackjack;

import java.util.ArrayList;

import com.skilldistillery.cardgames.common.AbstractHand;

public class BlackjackHand extends AbstractHand {
	
	// NO FIELDS
	
	public BlackjackHand() {
	
	}
	
	
	
	@Override
	public void getHandValue() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public boolean isBlackjack() {
		
		return true;
	}
	
	public boolean isBust() {
		
		return true;
	}
	
	
// isHard & isSoft - OPTIONAL	
	public boolean isHard() {
		
		return true;
	}
	
	public boolean isSoft() {
		
		return true;
	}





}

