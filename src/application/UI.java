package application;

import chess.ChessPiece;

public class UI {

	private static void printPiece(ChessPiece piece) {

		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
	}
	
	public static void printBoard(ChessPiece[][] pieces) {

		int rows = pieces.length;
		int columns = pieces[0].length;

		for (int i = 0; i < rows; i++) {
			System.out.print((rows - i) + " ");
			for (int j = 0; j < columns; j++) {
				printPiece(pieces[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	public static void printTabBoard(ChessPiece[][] pieces) {

		int rows = pieces.length;
		int columns = pieces[0].length;

		for (int i = 0; i < rows; i++) {
			System.out.print((rows - i) + "\t");
			for (int j = 0; j < columns; j++) {
				printPiece(pieces[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n\n");
		}
		System.out.println(" \ta\tb\tc\td\te\tf\tg\th");
	}

}
