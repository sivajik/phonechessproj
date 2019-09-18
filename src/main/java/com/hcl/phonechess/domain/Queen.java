package com.hcl.phonechess.domain;

/**
 * Class to represent "Queen" and it's possible moves from each starting point
 *
 */
public class Queen extends GenericChessPiece {

	/**
	 * Default Constructor
	 */
	public Queen() {
		this.type = ChessPieceType.Queen;
		
		/*
		 * The queen can be moved any number of unoccupied squares in a straight 
		 * line vertically, horizontally, or diagonally, thus combining the moves of 
		 * the rook and bishop
		 */
		this.allowableMoves = new int[][] {
			/* 0 */ {7, 9, 8, 5, 2},
			/* 1 */ {2, 3, 4, 7, 5, 9},
			/* 2 */ {1, 3, 5, 8, 0, 4, 6},
			/* 3 */ {1, 2, 6, 9, 5, 7},
			/* 4 */ {5, 6, 1, 7, 2, 8},
			/* 5 */ {4, 6, 2, 8, 0, 1, 3, 7, 9},
			/* 6 */ {4, 5, 3, 9, 2, 8},
			/* 7 */ {1, 4, 8, 9, 5, 3, 0},
			/* 8 */ {7, 9, 2, 5, 0, 4, 6},
			/* 9 */ {7, 8, 3, 6, 1, 5, 0}
			};
	}

}