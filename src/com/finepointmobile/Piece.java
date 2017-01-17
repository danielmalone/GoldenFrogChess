package com.finepointmobile;

/**
 * Created by danielmalone on 1/15/17.
 */
public interface Piece {

    public int defaultYPosition = 0;
    public int defaultXPosition = 0;
    public int color = 0; // 0 = black, 1 = white

    public void color();

    public void currentXPosition();

    public void currentYPosition();

    public void canMove();

    public void howPieceMoves(); // behavior for the piece to move.

    public void defaultPosition(); // x/y position for game start.
}
