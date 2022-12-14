package uk.ac.cam.ecw66.chess;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    public Bishop(Position pos, PieceColor color, Board board) {
        super('B', pos, color, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();
        position().getAllDiagonalMoves(8, board(), nextPositions);
        return nextPositions;
    }

    @Override
    public char icon() {
        return (colour() == PieceColor.BLACK) ? '♝' : '♗';
    }

    @Override
    public int value() {return 3;}

    public char name() {return 'B';}
}
