package uk.ac.cam.ecw66.chess;

import java.util.ArrayList;
import java.util.List;

import static uk.ac.cam.ecw66.chess.PieceColor.BLACK;
import static uk.ac.cam.ecw66.chess.PieceColor.WHITE;
import static uk.ac.cam.ecw66.chess.Position.Rank.SEVEN;
import static uk.ac.cam.ecw66.chess.Position.Rank.TWO;

public class Pawn extends Piece{
    public Pawn(Position pos, PieceColor color, Board board) {
        super('B', pos, color, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();
        int upDir = (colour() == WHITE ? 1 : -1);

        // move up by one
        addPawnPositionIfValid(upDir, 0, false, nextPositions);

        // move up left and right
        addPawnPositionIfValid(upDir, -1, true, nextPositions);
        addPawnPositionIfValid(upDir, 1, true, nextPositions);

        // move up two if on their home row
        if (position().getRank() == (colour() == BLACK ? SEVEN : TWO)) {
            addPawnPositionIfValid(upDir + upDir, 0, false, nextPositions);
        }
        return nextPositions;
    }
    private void addPawnPositionIfValid(
            int deltaRank,
            int deltaFile,
            boolean allowIfOccupiedByOpponent,
            List<Position> nextPositions) {

        Position movePosition = position().getPosAtDelta(deltaRank, deltaFile);

        if (movePosition != null) {
            boolean movePosOccupied = board().positionOccupied(movePosition);
            // the up left and right cases
            if (allowIfOccupiedByOpponent
                    && movePosOccupied
                    && board().atPosition(movePosition).colour() != colour()) {
                nextPositions.add(movePosition);
            }
            // the "up straight ahead" and "up straight ahead two" moves.
            else if (!allowIfOccupiedByOpponent && !movePosOccupied) {
                nextPositions.add(movePosition);
            }
        }
    }

    @Override
    public char icon() {
        return (colour() == PieceColor.BLACK) ? '♟' : '♙';
    }

    @Override
    public int value() {return 1;}

    private void computeKnightNextPositions(List<Position> nextPositions) {
        // directions a knight can travel in.

    }
}
