package com.hcl.phonechess.domain;

/**
 * Class to represent "Knight" and it's possible moves from each starting point
 *
 */
public class Knight extends GenericChessPiece {
	
	/**
	 * Default Constructor
	 */
	public Knight() {
		this.type = ChessPieceType.Knight;
		
		/*
		 * It moves to a square that is two squares away horizontally 
		 * and one square vertically, or two squares vertically and one square 
		 * horizontally.
		 */
		this.allowableMoves = new int[][] { 
			/* 0 */ { 4, 6 }, 
			/* 1 */ { 6, 8 }, 
			/* 2 */ { 7, 9 }, 
			/* 3 */ { 4, 8 }, 
			/* 4 */ { 3, 9, 0 }, 
			/* 5 */ { }, 
			/* 6 */ { 1, 7, 0 },
			/* 7 */ { 2, 6 }, 
			/* 8 */ { 1, 3 }, 
			/* 9 */ { 2, 4 } 
		};
	}
}