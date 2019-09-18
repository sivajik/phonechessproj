package com.hcl.phonechess.domain;

/**
 * Class to represent "King" and it's possible moves from each starting point
 *
 */
public class King extends GenericChessPiece {

	/**
	 * Default Constructor
	 */
	public King() {
		this.type = ChessPieceType.King;
		
		/*
		 * The king moves exactly one square horizontally, vertically, or diagonally
		 */
		this.allowableMoves = new int[][] { 
			/* 0 */ {7, 8, 9},
			/* 1 */ {2, 4, 5},
			/* 2 */ {1, 3, 4, 5, 6},
			/* 3 */ {2, 5, 6},
			/* 4 */ {1, 7, 2, 5, 8},
			/* 5 */ {1, 2, 3, 4, 6, 7, 8, 9},
			/* 6 */ {3, 9, 2, 5, 8},
			/* 7 */ {4, 5, 8, 0},
			/* 8 */ {4, 5, 6, 7, 9, 0},
			/* 9 */ {6, 5, 8, 0}
		};
	}
}