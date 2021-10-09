package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()];
        for (int row = 0; row<board.getRows(); row++) {
            for (int column = 0; column<board.getColumn(); column++) {
                mat[row][column] = (ChessPiece) board.piece(row, column);
            }
        }
        return mat;
    } 
}
