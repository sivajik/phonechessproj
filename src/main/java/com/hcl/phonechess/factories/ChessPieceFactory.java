package com.hcl.phonechess.factories;

import com.hcl.phonechess.domain.Bishop;
import com.hcl.phonechess.domain.GenericChessPiece;
import com.hcl.phonechess.domain.ChessPieceType;
import com.hcl.phonechess.domain.King;
import com.hcl.phonechess.domain.Knight;
import com.hcl.phonechess.domain.Pawn;
import com.hcl.phonechess.domain.Queen;
import com.hcl.phonechess.domain.Rook;

/**
 * A simple factory class implementation for creating respective chess piee
 * types based on given input type. This approach allows creation of new piece
 * types with in a common place.
 */
public class ChessPieceFactory {

	public static GenericChessPiece createChessPiece(ChessPieceType type) {
		switch (type) {
		case King:
			return new King();
		case Queen:
			return new Queen();
		case Bishop:
			return new Bishop();
		case Knight:
			return new Knight();
		case Rook:
			return new Rook();
		case Pawn:
			return new Pawn();
		default:
			throw new RuntimeException("No factory exists for given piece type: " + type);
		}
	}
}