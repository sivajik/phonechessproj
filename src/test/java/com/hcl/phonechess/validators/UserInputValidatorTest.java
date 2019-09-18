package com.hcl.phonechess.validators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hcl.phonechess.domain.ChessPieceType;
import com.hcl.phonechess.domain.UserInput;

import static com.hcl.phonechess.constants.ErrorMessages.ATLEAST_2_INPUTS_REQ;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_CHESS_PIECE_TYPE;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_START_KEY;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_NUMBER;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_PAWN_START;

public class UserInputValidatorTest {
	/*
	 * Section 1 - all invalid inputs
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAtleastTwoInputs() {
		try {
			String[] inputs = new String[1];
			inputs[0] = "knight";
			UserInputValidator.validate(inputs);
		} catch (IllegalArgumentException re) {
			String message = re.getMessage();
			assertEquals(ATLEAST_2_INPUTS_REQ, message);
			throw re;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidPieceType() {
		try {
			String[] inputs = new String[2];
			inputs[0] = "knightyknight";
			inputs[1] = "3";
			UserInputValidator.validate(inputs);
		} catch (IllegalArgumentException re) {
			String message = re.getMessage();
			assertEquals(INVALID_CHESS_PIECE_TYPE, message);
			throw re;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidStartKey() {
		try {
			String[] inputs = new String[2];
			inputs[0] = "knight";
			inputs[1] = "35";
			UserInputValidator.validate(inputs);
		} catch (IllegalArgumentException re) {
			String message = re.getMessage();
			assertEquals(INVALID_START_KEY, message);
			throw re;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidStartNumbr() {
		try {
			String[] inputs = new String[2];
			inputs[0] = "knight";
			inputs[1] = "abcd";
			UserInputValidator.validate(inputs);
		} catch (IllegalArgumentException re) {
			String message = re.getMessage();
			assertEquals(INVALID_NUMBER, message);
			throw re;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidPawnStart() {
		try {
			String[] inputs = new String[2];
			inputs[0] = "pawn";
			inputs[1] = "3";
			UserInputValidator.validate(inputs);
		} catch (IllegalArgumentException re) {
			String message = re.getMessage();
			assertEquals(INVALID_PAWN_START, message);
			throw re;
		}
	}

	/*
	 * Section 2 - all valid inputs
	 */
	@Test
	public void testValidInputKing() {
		String[] inputs = new String[2];
		inputs[0] = "king";
		inputs[1] = "0";
		UserInput userInput = UserInputValidator.validate(inputs);
		assertEquals(ChessPieceType.King, userInput.getType());
		assertEquals(0, userInput.getStartKeyPad());
	}

	@Test
	public void testValidInputQueen() {
		String[] inputs = new String[2];
		inputs[0] = "queen";
		inputs[1] = "0";
		UserInput userInput = UserInputValidator.validate(inputs);
		assertEquals(ChessPieceType.Queen, userInput.getType());
		assertEquals(0, userInput.getStartKeyPad());
	}

	@Test
	public void testValidInputBishop() {
		String[] inputs = new String[2];
		inputs[0] = "bishop";
		inputs[1] = "0";
		UserInput userInput = UserInputValidator.validate(inputs);
		assertEquals(ChessPieceType.Bishop, userInput.getType());
		assertEquals(0, userInput.getStartKeyPad());
	}

	@Test
	public void testValidInputKnight() {
		String[] inputs = new String[2];
		inputs[0] = "knight";
		inputs[1] = "0";
		UserInput userInput = UserInputValidator.validate(inputs);
		assertEquals(ChessPieceType.Knight, userInput.getType());
		assertEquals(0, userInput.getStartKeyPad());
	}

	@Test
	public void testValidInputRook() {
		String[] inputs = new String[2];
		inputs[0] = "rook";
		inputs[1] = "0";
		UserInput userInput = UserInputValidator.validate(inputs);
		assertEquals(ChessPieceType.Rook, userInput.getType());
		assertEquals(0, userInput.getStartKeyPad());
	}

	@Test
	public void testValidInputPawn() {
		String[] inputs = new String[2];
		inputs[0] = "pawn";
		inputs[1] = "0";
		UserInput userInput = UserInputValidator.validate(inputs);
		assertEquals(ChessPieceType.Pawn, userInput.getType());
		assertEquals(0, userInput.getStartKeyPad());
	}
	
	/*
	 * Section 3 - Mixed Case test
	 */
	@Test
	public void testValidInputRookMixedCase() {
		String[] inputs = new String[2];
		inputs[0] = "RoOk";
		inputs[1] = "0";
		UserInput userInput = UserInputValidator.validate(inputs);
		assertEquals(ChessPieceType.Rook, userInput.getType());
		assertEquals(0, userInput.getStartKeyPad());
	}
}

// king , Queen, Bishop, Knight, Rook, Pawn
