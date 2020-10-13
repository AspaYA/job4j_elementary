package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void whenwayX1Y1X2Y2Then1() {
        byte out = ChessBoard.way((byte) 1, (byte) 1, (byte) 2, (byte) 2);
        assertThat(out, is((byte) 1));
    }

    @Test
    public void whenwayX0Y0X7Y7Then7() {
        byte out = ChessBoard.way((byte) 0, (byte) 0, (byte) 7, (byte) 7);
        assertThat(out, is((byte) 7));
    }

    @Test
    public void whenwayNoGoodStepThen0() {
        byte out = ChessBoard.way((byte) 1, (byte) 1, (byte) 2, (byte) 3);
        assertThat(out, is((byte) 0));
    }
}