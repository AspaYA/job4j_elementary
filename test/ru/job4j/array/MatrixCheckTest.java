package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void monoHorizontal() {
        char[][] arr = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        assertThat(MatrixCheck.monoHorizontal(arr, 1), is(true));
    }

    @Test
    public void monoVertical() {
        char[][] arr = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.monoVertical(arr, 2), is(true));
    }
}