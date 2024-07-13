package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	
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
			//while ()
			//sb.append(", ");
			
			sb.append(card + "," ); 
			//while (card = cardsInHand.length)
			
			
			//System.out.println();
			//if (card.length < cardsInHand.length) {
				
		}
		
		return sb.toString();
		
		
	}
	
	
}
