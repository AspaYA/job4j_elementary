package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void multiple() {
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(Matrix.multiple(2), is(expected));
    }
}