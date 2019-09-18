package com.hcl.phonechess.domain;

/**
 * Class to represent "Pawn" and it's possible moves from each starting point
 *
 */
public class Pawn extends GenericChessPiece {

	/**
	 * Default Constructor
	 */
	public Pawn() {
		this.type = ChessPieceType.Pawn;
		
		/*
		 * For the case where the piece is a Pawn, starting on one of the 
		 * bottom two rows (i.e. any of the digits 7, 8, 9 and 0), 
		 * the Pawn may move either one or two spaces forward the first time it moves.
		 * When a Pawn reaches the top row, it becomes a Queen. 
		 */
		this.allowableMoves = new int[][] { 
			/* 0 */ {8, 5},
			/* 1 */ {2, 3, 4, 7, 5, 9}, // after becoming queen.
			/* 2 */ {1, 3, 5, 8, 0, 4, 6},
			/* 3 */ {1, 2, 6, 9, 5, 7}, // after becoming queen
			/* 4 */ {},
			/* 5 */ {},
			/* 6 */ {},
			/* 7 */ {1, 4},
			/* 8 */ {2, 5},
			/* 9 */ {3, 6}
		};
	}
}