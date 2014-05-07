package com.jpappe.blackjack.card;

/**
 * An individual card, which has a suit and an ordinal
 * 
 * @author jacob
 * 
 */
public class Card {

	public final Suit suit;
	public final Ordinal ordinal;

	public Card( Suit s, Ordinal o ) {
		this.suit = s;
		this.ordinal = o;
	}

	@Override
	public String toString() {
		return "" + ordinal.label + suit.abbrev();
	}

}
