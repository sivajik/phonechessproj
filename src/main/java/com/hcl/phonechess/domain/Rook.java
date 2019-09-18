package com.hcl.phonechess.domain;

/**
 * Class to represent "Rook" and it's possible moves from each starting point
 *
 */
public class Rook extends GenericChessPiece {
	
	/**
	 * Default Constructor
	 */
	public Rook() {
		this.type = ChessPieceType.Rook;

		/*
		 * The rook moves horizontally or vertically,
		 */
		this.allowableMoves = new int[][] { 
			/* 0 */ { 2, 5, 8 }, 
			/* 1 */ { 2, 3, 4, 7 }, 
			/* 2 */ { 1, 3, 5, 8, 0 },
			/* 3 */ { 1, 2, 6, 9 }, 
			/* 4 */ { 5, 6, 1, 7 }, 
			/* 5 */ { 4, 6, 2, 8, 0 }, 
			/* 6 */ { 4, 5, 3, 9 },
			/* 7 */ { 1, 4, 8, 9, }, 
			/* 8 */ { 7, 9, 2, 5, 0 }, 
			/* 9 */ { 7, 8, 3, 6 } };
	}
}