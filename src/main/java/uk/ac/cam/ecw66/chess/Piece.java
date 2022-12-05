/*
 * Copyright 2022 Ben Philps <bp413@cam.ac.uk>, E.C. Worth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.ecw66.chess;

import static uk.ac.cam.ecw66.chess.PieceColor.BLACK;
import static uk.ac.cam.ecw66.chess.PieceColor.WHITE;
import static uk.ac.cam.ecw66.chess.Position.Rank.SEVEN;
import static uk.ac.cam.ecw66.chess.Position.Rank.TWO;

import java.util.ArrayList;
import java.util.List;

public class Piece {

    public static int KING_VALUE = 10000;

    private Position position;
    private final PieceColor pieceColor;
    private final Board board;
    private final char name;

    public Piece(char name, Position piecePosition, PieceColor pieceColor, Board board) {
        this.name = name;
        this.position = piecePosition;
        this.pieceColor = pieceColor;
        this.board = board;
    }

  /* naming convention:
     K -> king
     P -> pawn
     B -> bishop
     N -> knight
     R -> rook
     Q -> queen
  */

    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();
        return nextPositions;
    }

    public char icon() {
        return 0;
    }

    public int value() {

        return 0;

    }

    public Position position() {
        return position;
    }

    public char name() {
        return name;
    }

    public void moveTo(Position newPosition) {
        position = newPosition;
    }

    public PieceColor colour() {
        return pieceColor;
    }

    public String toString() {
        return name() + " " + position.toString();
    }

    public Board board() {
        return board;
    }
}
