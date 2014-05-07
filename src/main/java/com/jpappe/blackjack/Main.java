package com.jpappe.blackjack;

import java.util.Scanner;

import com.jpappe.blackjack.card.Deck;

/**
 * Main driver for the blackjack "game". Asks the user for the number of (standard 52-card) decks to
 * use, then draws 2-card hands until all cards are depleted and outputs the number of natural black
 * jacks.
 * 
 * 
 * @author jacob
 * 
 */
public class Main {

	public static void main( String[] args ) {
		Scanner scan = new Scanner( System.in );

		int numDecks = 0;
		System.out.println( "Number of decks to use:" );
		numDecks = scan.nextInt();
		scan.close();

		Deck deck = new Deck( numDecks );
		Blackjack game = new Blackjack( deck );

		game.play();

		System.out.println( String.format( "After %d hands there was %d blackjacks at %d%%", game.getHandCounter(), game.getBlackjackCounter(), (100 * game.getBlackjackCounter() / game.getHandCounter()) ) );
	}

}
