package com.hcl.phonechess.domain;

import java.util.Arrays;;

/**
 * Class to represent any generic piece on a given chess board.
 *
 */
public class GenericChessPiece {
	/**
	 * constant to represent required phone number length
	 */
	private static final int REQ_PHONE_NUM_LEN = 10;

	/**
	 * constant to represent total number of valid digits on phone
	 */
	private static final int DIGITS_ON_KEY_PAD = 10;

	/**
	 * All possible moves for a given piece are captured as a 2D array. Each index
	 * represents key pad on the phone.
	 */
	protected int[][] allowableMoves;

	/**
	 * Type of the chess piece (usually one of the King, Queen, Bishop, Knight,
	 * Rook, Pawn)
	 */
	protected ChessPieceType type;

	/**
	 * Default getter method for type of the chess piece
	 * 
	 * @return
	 */
	public ChessPieceType getType() {
		return type;
	}

	/**
	 * Method to calculate the total number of valid count the number of distinct
	 * legal phone numbers (beginning with the starting digit) that can be generated
	 * by moving the piece around a standard phone pad. Rather doing graph approach
	 * (DFS) or recursive calls which usually recalculates the moves unnecessarily.
	 * Hence dynamic programming technique was used to capture the previous moves
	 * and new moves to calculate total possible numbers.
	 * 
	 * 
	 * The process repeats for 'n' time where n is length of the required phone
	 * numbers. In each iteration form a given starting index (0 to 9) see all
	 * possible moves a given piece can go. This approach takes the run time of
	 * linear O(n) and a fixed space of 2 one dimensional arrays (20 cells in total)
	 * irrespective of the length of the phone number. Hence space complexity would
	 * be O(1). In each iteration keep a store of moves so that it can be reused in
	 * next iteration. At the end {@ currMoves} array will hold all valid number
	 * counts from "each" cell of the keypad however this method should return value
	 * from a given starting key.
	 * 
	 * @param startKeyPad
	 * @return
	 */
	public int getPhNumberCount(int startKeyPad) {
		int[] prevMoves = new int[DIGITS_ON_KEY_PAD], currMoves = new int[DIGITS_ON_KEY_PAD];
		Arrays.fill(prevMoves, 1);

		for (int jumpCount = 1; jumpCount < REQ_PHONE_NUM_LEN; jumpCount++) {
			for (int currMove = 0; currMove < allowableMoves.length; currMove++) {
				int tempSum = 0;
				for (int eachPossibleMove : allowableMoves[currMove]) {
					tempSum += prevMoves[eachPossibleMove];
				}
				currMoves[currMove] = tempSum;
			}
			System.arraycopy(currMoves, 0, prevMoves, 0, 10);
		}
		return currMoves[startKeyPad];
	}
}