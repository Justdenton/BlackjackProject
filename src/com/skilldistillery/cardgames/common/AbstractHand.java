package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	
	protected List<Card> cardsInHand;
	
	
	public AbstractHand() {
		
		this.cardsInHand = new ArrayList<>();
	}
	
	
	public void addCard(Card card) {
		
	}

	
	
	public abstract int getHandValue();
	
	
	
	public void clear() {
		
	}
	
	
	
	
	//toString
	
	
	
	
	
}
