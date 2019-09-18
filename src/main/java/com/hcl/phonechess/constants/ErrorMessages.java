package com.hcl.phonechess.constants;

/**
 * Main class to hold all possible error message could encounter while
 * validating given user inputs.
 *
 */
public class ErrorMessages {
	public static final String ATLEAST_2_INPUTS_REQ = "Atleast 2 inputs are required. <Piece Type> <Start Key Pad>";
	public static final String INVALID_CHESS_PIECE_TYPE = "Given chess piece Type is not a valid piece. Valid (any case) are: King, Queen, Bishop, Knight, Rook, Pawn";
	public static final String INVALID_START_KEY = "Given start keypad does not fall between 0 - 9";
	public static final String INVALID_NUMBER = "Given start keypad does not seems to be valid number";
	public static final String INVALID_PAWN_START = "For a given 'Pawn' piece, start position should be 0, 7, 8, 9 only";

	public static final String GENERIC_ERROR_MSG = "Unexpected exception occured while validating inputs";
}
