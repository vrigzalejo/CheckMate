package com.chess.checkmate.gamelogic;

/*
 * Contains enough information to undo a previous mode.
 * Set by makeMove(). Used by unMakeMove()
 */

public class UndoInfo {
	int capturedPiece;
	int castleMask;
	int epSquare;
	int halfMoveClock;
}
