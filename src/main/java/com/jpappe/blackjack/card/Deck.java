package com.jpappe.blackjack.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Indicates a deck of cards. This actually represents the stack of cards in play and may consist of
 * multiple individual "decks" of 52 cards.
 * 
 * @author jacob
 * 
 */
public class Deck {

	private List<Card> cards;

	/**
	 * constructor allowing a deck to consist of an arbitrary number of individual "decks" of 52 cards
	 * each.
	 * 
	 * @param decks
	 */
	public Deck( int decks ) {
		cards = new ArrayList<Card>();
		for ( int i = 0 ; i < decks ; i++ ) {
			for ( Suit s : Suit.values() ) {
				for ( Ordinal o : Ordinal.values() ) {
					cards.add( new Card( s, o ) );
				}
			}
		}
	}

	/**
	 * By default, a deck consists of only 1 "deck" of cards (i.e., 52 cards)
	 */
	public Deck() {
		this( 1 );
	}

	/**
	 * randomize the order of the cards in the deck
	 */
	public void shuffle() {
		Collections.shuffle( cards, new Random( System.nanoTime() ) );
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards( List<Card> cards ) {
		this.cards = cards;
	}

}
