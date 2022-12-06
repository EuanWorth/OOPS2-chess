package uk.ac.cam.ecw66.chess;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    public Knight(Position pos, PieceColor color, Board board) {
        super('N', pos, color, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();
        final int[][] nextPosDeltas =
                new int[][] {
                        {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
                        {2, 1}, {-2, 1}, {2, -1}, {-2, -1}
                };

        // iterate through all possible positions, getting any valid next positions
        for (int[] posDeltaPair : nextPosDeltas) {
            position().addPosAtDelta(posDeltaPair[0], posDeltaPair[1], board(), nextPositions);
        }
        return nextPositions;
    }

    @Override
    public char icon() {
        return (colour() == PieceColor.BLACK) ? '♞' : '♘';
    }

    @Override
    public int value() {return 3;}

    public char name() {return 'N';}
}
