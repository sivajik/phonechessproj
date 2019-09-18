package com.hcl.phonechess.domain;

/**
 * Data Transfer Object class to encapsulate given user inputs.
 */
public class UserInput {
	/**
	 * Type of the piece given be user
	 */
	private ChessPieceType type;

	/**
	 * Starting key pad number
	 */
	private int startKeyPad;

	/**
	 * Constructor to capture user inputs.
	 * 
	 * @param type
	 * @param startKeyPad
	 */
	public UserInput(ChessPieceType type, int startKeyPad) {
		super();
		this.type = type;
		this.startKeyPad = startKeyPad;
	}

	/**
	 * Default getter method for piece type
	 */
	public ChessPieceType getType() {
		return type;
	}

	/**
	 * Default getter method for startKeyPad
	 */
	public int getStartKeyPad() {
		return startKeyPad;
	}

	@Override
	public String toString() {
		return "UserInput [type=" + type + ", startKeyPad=" + startKeyPad + "]";
	}

}