package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cardsInDeck;
	
	public Deck() {
		createDeck();
	}
	
	public void createDeck(){
		
		cardsInDeck = new ArrayList<>(); // 52?
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cardsInDeck.add(new Card(rank, suit));
			}
		}  System.out.println((cardsInDeck));
	}

	public int checkDeckSize() {
		return this.cardsInDeck.size();
	}

	public Card dealCard() {
		return cardsInDeck.remove(0);
	}

	public void shuffle() {
		//System.out.println(); // TEST
		Collections.shuffle(cardsInDeck);
		//System.out.println(cardsInDeck.get(4));/
		//System.out.println();
		//System.out.println(cardsInDeck);
	}
	
	public boolean isEmpty() {
		
		if(this.cardsInDeck.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	

}
