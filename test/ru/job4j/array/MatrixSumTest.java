package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSumThen10() {
        int[][] arr = {
                {10}
        };
        assertThat(MatrixSum.sum(arr), is(10));
    }

    @Test
    public void whenSumThen6() {
        int[][] arr = {
                {1, 2},
                {1, 2}
        };
        assertThat(MatrixSum.sum(arr), is(6));
    }

    @Test
    public void whenSumThen7() {
        int[][] arr = {
                {1, 2, 1},
                {1, 2, 0}
        };
        assertThat(MatrixSum.sum(arr), is(7));
    }
}