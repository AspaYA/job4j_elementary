package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] arr = {
                {0, 1, 2},
                {0, -1, -2},
                {0, 1, -2}
        };
        int[][] expected = {
                {0, 1, 2},
                {0, 0, 0},
                {0, 1, 0}
        };
        assertThat(SkipNegative.skip(arr), is(expected));
    }

    @Test
    public void skip1() {
        int[][] arr = {
                {0, 1, 2},
                {0, -1},
                {0, 1, -2}
        };
        int[][] expected = {
                {0, 1, 2},
                {0, 0},
                {0, 1, 0}
        };
        assertThat(SkipNegative.skip(arr), is(expected));
    }
}