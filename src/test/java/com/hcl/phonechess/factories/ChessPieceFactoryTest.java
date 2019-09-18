package com.hcl.phonechess.factories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hcl.phonechess.domain.ChessPieceType;
import com.hcl.phonechess.domain.GenericChessPiece;

public class ChessPieceFactoryTest {

	@Test
	public void testKingCreation() {
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(ChessPieceType.King);
		assertEquals(chessPiece.getType(), ChessPieceType.King);
	}
	
	@Test
	public void testQueenCreation() {
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(ChessPieceType.Queen);
		assertEquals(chessPiece.getType(), ChessPieceType.Queen);
	}
	
	@Test
	public void testBishopCreation() {
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(ChessPieceType.Bishop);
		assertEquals(chessPiece.getType(), ChessPieceType.Bishop);
	}
	
	@Test
	public void testKnightCreation() {
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(ChessPieceType.Knight);
		assertEquals(chessPiece.getType(), ChessPieceType.Knight);
	}
	
	@Test
	public void testRookCreation() {
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(ChessPieceType.Rook);
		assertEquals(chessPiece.getType(), ChessPieceType.Rook);
	}
	
	@Test
	public void testPawnCreation() {
		GenericChessPiece chessPiece = ChessPieceFactory.createChessPiece(ChessPieceType.Pawn);
		assertEquals(chessPiece.getType(), ChessPieceType.Pawn);
	}

}