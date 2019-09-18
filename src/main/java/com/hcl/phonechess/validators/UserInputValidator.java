package com.hcl.phonechess.validators;

import static com.hcl.phonechess.constants.ErrorMessages.ATLEAST_2_INPUTS_REQ;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_PAWN_START;
import static com.hcl.phonechess.constants.ErrorMessages.GENERIC_ERROR_MSG;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_NUMBER;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_CHESS_PIECE_TYPE;
import static com.hcl.phonechess.constants.ErrorMessages.INVALID_START_KEY;

import com.hcl.phonechess.domain.ChessPieceType;
import com.hcl.phonechess.domain.UserInput;

/**
 * Utility validator class to validate give user input and create a
 * {@code UserInput} class object. This program ensure given two inputs are
 * valid and a special validation happens for Pawn chess piece type where start
 * location of Pawn should be 0 or 7, 8, 9 only.
 */
public class UserInputValidator {
	/**
	 * Method to validate given user input and return a {@code UserInput} object
	 * provided input passes all checks
	 * 
	 * @param args
	 * @return
	 */
	public static UserInput validate(String[] args) {
		if (args.length < 2) {
			throw new IllegalArgumentException(ATLEAST_2_INPUTS_REQ);
		}

		try {
			String chessPieceType = args[0];
			String startKeyPadStr = args[1];

			int startKeyPad = validateStartKey(startKeyPadStr);
			ChessPieceType pieceType = validatePieceType(chessPieceType, startKeyPad);
			return new UserInput(pieceType, startKeyPad);

		} catch (IllegalArgumentException iae) {
			throw iae;
		} catch (Exception e) {
			throw new RuntimeException(GENERIC_ERROR_MSG, e);
		}
	}

	/**
	 * Special treatment for Pawn chess piece type where start key pad should be 0
	 * or 7/8/9 only. Any other starting key pad should give
	 * {@code IllegalArgumentException}
	 * 
	 * @param pieceType
	 * @param startKeyPad
	 * @return
	 */
	public static ChessPieceType handlePawn(ChessPieceType pieceType, int startKeyPad) {
		if (startKeyPad == 0 || (startKeyPad >= 7 && startKeyPad <= 9)) {
			return pieceType;
		} else {
			throw new IllegalArgumentException(INVALID_PAWN_START);
		}
	}

	/**
	 * Method to return starting key pad location after validations like should be a
	 * number and between 0 and 9 (the standard telephone dial pad numbers)
	 * 
	 * @param startKeyStr
	 * @return
	 */
	public static int validateStartKey(String startKeyStr) {
		try {
			int startKey = Integer.parseInt(startKeyStr);
			if (!(startKey >= 0 && startKey <= 9)) {
				throw new IllegalArgumentException(INVALID_START_KEY);
			} else {
				return startKey;
			}
		} catch (NumberFormatException nfe) {
			throw new IllegalArgumentException(INVALID_NUMBER, nfe);
		}
	}

	/**
	 * Method to return valid {@code ChessPieceType} for a given chess piece type.
	 * Special handling needed for Pawn where start location is restricted. In case
	 * of invalid inputs {@code IllegalArgumentException} will be thrown.
	 * 
	 * @param chessPieceType
	 * @param startKeyPad
	 * @return
	 */
	public static ChessPieceType validatePieceType(String chessPieceType, int startKeyPad) {
		for (ChessPieceType eachType : ChessPieceType.values()) {
			if (eachType.toString().equalsIgnoreCase(chessPieceType)) {
				if (eachType == ChessPieceType.Pawn) {
					return handlePawn(eachType, startKeyPad);
				} else {
					return eachType;
				}
			}
		}
		throw new IllegalArgumentException(INVALID_CHESS_PIECE_TYPE);
	}
}
