package com.chess.checkmate.gamelogic;

public class ChessParseError extends Exception {
	private static final long serialVersionUID = -6051856171275301175L;
	
	public Position pos;
	
	public ChessParseError() {
    }
    public ChessParseError(String msg) {
        super(msg);
        pos = null;
    }
    public ChessParseError(String msg, Position pos) {
    	super(msg);
    	this.pos = pos;
    }
}
