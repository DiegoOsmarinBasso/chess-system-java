package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch, args);

				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				if (args.length == 0) {
					UI.printBoard(chessMatch.getPieces(), possibleMoves, source.toPosition().getRow(),
							source.toPosition().getColumn());
				} else {
					UI.printTabBoard(chessMatch.getPieces(), possibleMoves, source.toPosition().getRow(),
							source.toPosition().getColumn());
				}

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				/* ChessPiece capturedPiece = */
				chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}

	}

}
