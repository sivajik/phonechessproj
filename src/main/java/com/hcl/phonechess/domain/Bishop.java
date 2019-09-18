package com.hcl.phonechess.domain;

/**
 * Class to represent "Bishop" and it's possible moves from each starting point
 *
 */
public class Bishop extends GenericChessPiece {

	/**
	 * Default Constructor
	 */
	public Bishop() {
		this.type = ChessPieceType.Bishop;
		
		/*
		 * The Bishop moves diagonally any number of squares, forwards 
		 * or backwards
		 */
		this.allowableMoves = new int[][] { 
			/* 0 */ {7, 9},
			/* 1 */ {5, 9},
			/* 2 */ {4, 6},
			/* 3 */ {5, 7},
			/* 4 */ {2, 8},
			/* 5 */ {1, 3, 7, 9},
			/* 6 */ {2, 8},
			/* 7 */ {5, 3, 0},
			/* 8 */ {4, 6 },
			/* 9 */ {0, 5}
		};
	}
}