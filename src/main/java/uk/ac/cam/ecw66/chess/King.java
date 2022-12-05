package uk.ac.cam.ecw66.chess;
import jdk.jfr.Percentage;

import static uk.ac.cam.ecw66.chess.PieceColor.BLACK;
import static uk.ac.cam.ecw66.chess.PieceColor.WHITE;
import static uk.ac.cam.ecw66.chess.Position.Rank.SEVEN;
import static uk.ac.cam.ecw66.chess.Position.Rank.TWO;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    public static int KING_VALUE = 10000;
    public King(Position pos, PieceColor color, Board board) {
        super('K', pos, color, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();
        position().getAllDiagonalMoves(1, board(), nextPositions);
        position().getAllStraightMoves(1, board(), nextPositions);
        return nextPositions;
    }

    @Override
    public char icon() {
        return (colour() == PieceColor.BLACK) ? '♚' : '♔';
    }

    @Override
    public int value() {return KING_VALUE;}
}
