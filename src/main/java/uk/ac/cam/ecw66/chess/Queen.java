package uk.ac.cam.ecw66.chess;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    public Queen(Position pos, PieceColor color, Board board) {
        super('Q', pos, color, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();
        position().getAllDiagonalMoves(8, board(), nextPositions);
        position().getAllStraightMoves(8, board(), nextPositions);
        return nextPositions;
    }

    @Override
    public char icon() {
        return (colour() == PieceColor.BLACK) ? '♛' : '♕';
    }

    @Override
    public int value() {return 10;}
    public char name() {return 'Q';}
}
