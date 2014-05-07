package com.jpappe.blackjack.card;

/**
 * Indicates the ordinal value of a card
 * 
 * @author jacob
 * 
 */
public enum Ordinal {

	ONE (1, '1'),
	TWO (2, '2'),
	THREE (3, '3'),
	FOUR (4, '4'),
	FIVE (5, '5'),
	SIX (6, '6'),
	SEVEN (7, '7'),
	EIGHT (8, '8'),
	NINE (9, '9'),
	TEN (10, 'T'),
	JACK (10, 'J'),
	QUEEN (10, 'Q'),
	KING (10, 'K'),
	ACE (11, 'A');

	public final int value;
	public final char label;

	Ordinal( int i, char l ) {
		value = i;
		label = l;
	}

}
