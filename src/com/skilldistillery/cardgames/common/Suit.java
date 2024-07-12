package com.skilldistillery.cardgames.common;

public enum Suit {

	HEARTS("Hearts"), 
	SPADES("Spades"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");
	
	// Add a private name field to Suit.
	private String name;
	
	// Add a one-arg constructor to Suit.
		// and set the name fields to Hearts, Spades, Clubs, Diamonds.
	private Suit(String name) {
		
		this.name = name;
	}
	// Override the toString method to output this name. 
	@Override
	public String toString() {
		return this.name; 
	}
	
}
