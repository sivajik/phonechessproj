package com.hcl.phonechess;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hcl.phonechess.domain.ChessPieceType;
import com.hcl.phonechess.domain.GenericChessPiece;
import com.hcl.phonechess.domain.UserInput;
import com.hcl.phonechess.factories.ChessPieceFactory;

public class AppTest {

	@Test
	public void testQueenMovesFromZero() {
		UserInput userInput = new UserInput(ChessPieceType.Queen, 0);
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(userInput.getType());
		int result = chessPiece.getPhNumberCount(userInput.getStartKeyPad());
		assertEquals(22447329, result);
	}

	@Test
	public void testQueenMovesFromSeven() {
		UserInput userInput = new UserInput(ChessPieceType.Queen, 7);
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(userInput.getType());
		int result = chessPiece.getPhNumberCount(userInput.getStartKeyPad());
		assertEquals(28802173, result);
	}

	@Test
	public void testKnightMoveFromZero() {
		UserInput userInput = new UserInput(ChessPieceType.Knight, 0);
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(userInput.getType());
		int result = chessPiece.getPhNumberCount(userInput.getStartKeyPad());
		assertEquals(1760, result);
	}

	@Test
	public void testKnightMoveFromFive() {
		UserInput userInput = new UserInput(ChessPieceType.Knight, 5);
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(userInput.getType());
		int result = chessPiece.getPhNumberCount(userInput.getStartKeyPad());
		assertEquals(0, result);
	}

	@Test
	public void testRookMoveFromFour() {
		UserInput userInput = new UserInput(ChessPieceType.Rook, 0);
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(userInput.getType());
		int result = chessPiece.getPhNumberCount(userInput.getStartKeyPad());
		assertEquals(389979, result);
	}
}