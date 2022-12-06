package uk.ac.cam.ecw66.chess;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
        public Rook(Position pos, PieceColor color, Board board) {
            super('R', pos, color, board);
        }

        @Override
        public List<Position> validNextPositions() {
            List<Position> nextPositions = new ArrayList<>();;
            position().getAllStraightMoves(8, board(), nextPositions);
            return nextPositions;
        }

        @Override
        public char icon() {
            return (colour() == PieceColor.BLACK) ? '♜' : '♖';
        }

        @Override
        public int value() {return 5;}

        public char name() {return 'R';}
}
