package com.skilldistillery.blackjack.app;

import java.util.Scanner;
import com.skilldistillery.blackjack.Dealer;
import com.skilldistillery.blackjack.Player;

public class BlackjackApp {
	
	// NO List<Cards>
	// NO Deck
	// Stretch Goal - ArrayList of players.

	private Player player = new Player();
    private Dealer dealer = new Dealer();
    
    public static void main(String[] args) {
        
    	BlackjackApp app = new BlackjackApp();
        app.run();
    }
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        dealer.shuffleDeck();
        
        // ****************************************************************
        player.addCardToHand(dealer.dealCard()); 
        dealer.addCardToHand(dealer.dealCard()); 
        
        player.addCardToHand(dealer.dealCard()); 
        dealer.addCardToHand(dealer.dealCard()); 
        
        System.out.println(player);
        System.out.println(dealer.displayPartialHand());
        
        // Player Blackjack
        if (player.isBlackjack()) {
            System.out.println("\nBLACKJACK! Player wins!");
            scanner.close();
            return;
        }

        // Need to add if Player hits and sum = 21 = win
        	// rather than having to choose to stand at 21
        // If no Player Blackjack:
        boolean playerTurn = true;
        while (playerTurn && !player.isBust()) {
            System.out.println("Enter your choice, HIT or STAND: ");
            String playerChoice = scanner.next();

            if (playerChoice.equalsIgnoreCase("hit")) {
                player.addCardToHand(dealer.dealCard());
                System.out.println(player.displayHand());

                if (player.isBust()) {
                    System.out.println("Player busts - dealer wins.");
                    scanner.close();
                    return;
                } else if (player.getHandValue() == 21) {
                    System.out.println("Player win!");
                    scanner.close();
                    return;
                }
            } else if (playerChoice.equalsIgnoreCase("stand")) {
                playerTurn = false;
            }
        }
        
        // Once user has hit, stand, or bust & hasn't won OR lost: 
        while (dealer.getHandValue() < 17) {
            dealer.addCardToHand(dealer.dealCard());
        }
        
        // ****************************************************************
        System.out.println(dealer);
        
        if (dealer.isBust()) {
            System.out.println("Dealer busts - player wins.");
        } else if (player.getHandValue() > dealer.getHandValue()) {
            System.out.println("\nPlayer wins!");
        } else if (player.getHandValue() < dealer.getHandValue()) {
            System.out.println("\nDealer wins!");
        } else {
            System.out.println("\nTie!");
        }
        
        scanner.close();
    }
    
}

