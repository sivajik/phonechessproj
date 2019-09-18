package com.hcl.phonechess;

import com.hcl.phonechess.domain.GenericChessPiece;
import com.hcl.phonechess.domain.UserInput;
import com.hcl.phonechess.factories.ChessPieceFactory;
import com.hcl.phonechess.validators.UserInputValidator;

/**
 * Main class (driver class) to test valid phone numbers count for a given chess
 * piece from a starting key pad (hopping using usual chess board principles).
 * This program takes chess piece type & start key pad number. User can give any
 * one of the valid chess piece types (case insensitive) such as King, Queen,
 * Bishop, Knight, Rook, Pawn.
 * 
 * 
 * This program validates and handles all input validations before invoking
 * {@code GenericChessPiece} class {@code getPhNumberCount} method to do actual
 * business logic using dynamic programming technique.
 * 
 * @author sivaji_kondapalli@yahoo.com
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		String[] input = new String[2];// could use args but to run quickly from IDE
		input[0] = "queen"; // One of (no case) : King, Queen, Bishop, Knight, Rook, Pawn
		input[1] = "5";

		// Validate the given user input values.
		UserInput userInput = UserInputValidator.validate(input);

		// Based on the given chess type, create respective piece type.
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(userInput.getType());

		// Invocation to calculate phone numbers formed from hopping
		int startKey = userInput.getStartKeyPad();
		int result = chessPiece.getPhNumberCount(startKey);
		System.out.printf("Phone Numbers Count: '%s' (starting at %d) are %d ", chessPiece.getType(), startKey, result);
	}
}