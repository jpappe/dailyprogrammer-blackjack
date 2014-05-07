package com.jpappe.blackjack;

import com.jpappe.blackjack.card.Card;
import com.jpappe.blackjack.card.Deck;

/**
 * Manages the "game" of blackjack
 * 
 * @author jacob
 * 
 */
public class Blackjack {

	private int handCounter = 0;
	private int blackjackCounter = 0;
	private Deck deck;

	public Blackjack( Deck deck ) {
		this.deck = deck;
	}

	/**
	 * "Play" the game. This loops through all the cards in "hands" of 2 and counts up how many score
	 * a natural blackjack
	 */
	public void play() {
		System.out.println( "Shuffling deck" );
		deck.shuffle();

		Card[] hand = new Card[2];
		// we'll just iterate down through the deck rather than
		// explicitly drawing cards as it's less expensive
		int index = (deck.getCards().size() - 1);
		int handValue = 0;
		while ( index > 0 ) { // while we have 2 cards in the deck
			handCounter++;
			System.out.println( "\nHand " + handCounter );
			hand[0] = deck.getCards().get( index-- );
			hand[1] = deck.getCards().get( index-- );

			handValue = hand[0].ordinal.value + hand[1].ordinal.value;
			System.out.println( "Cards: " + hand[0].toString() + ", " + hand[1].toString() + "; Value: " + handValue );
			
			if ( handValue == 21 ) {
				System.out.println( " ! BLACKJACK !" );
				blackjackCounter++;
			}
		}
	}

	public int getHandCounter() {
		return handCounter;
	}

	public void setHandCounter( int handCounter ) {
		this.handCounter = handCounter;
	}

	public int getBlackjackCounter() {
		return blackjackCounter;
	}

	public void setBlackjackCounter( int blackjackCounter ) {
		this.blackjackCounter = blackjackCounter;
	}

}
