package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard  chessBoard;

    @Before
    public void setUp() {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() {
        chessBoard = null;
    }

    @Test
    public void returnChessBoard() {
        String[][] result = chessBoard.chessBoard();
        String[][] expected = {{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}};
        assertEquals(expected,result);
    }

}