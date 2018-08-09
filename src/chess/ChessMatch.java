package chess;

import boardgame.Board;

public class ChessMatch {

	private static final int BOARD_ROWS = 8;
	private static final int BOARD_COLUMNS = 8;
	private Board board;
	
	public ChessMatch() {
		board = new Board(BOARD_ROWS, BOARD_COLUMNS);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	
}
