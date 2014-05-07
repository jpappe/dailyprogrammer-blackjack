package com.jpappe.blackjack.card;

/**
 * possible suits for a card
 * 
 * @author jacob
 * 
 */
public enum Suit {

	DIAMOND ('D'),
	SPADE ('S'),
	CLUB ('C'),
	HEART ('H');

	Suit( char c ) {
		this.value = c;
	}

	public char abbrev() {
		return this.value;
	}

	public static Suit forChar( char c ) {
		switch ( c ) {
			case 'D':
				return DIAMOND;
			case 'S':
				return SPADE;
			case 'C':
				return CLUB;
			case 'H':
				return HEART;
			default:
				throw new IllegalArgumentException( "Unknown suit abbreviation: " + c );
		}
	}

	private char value;

}
