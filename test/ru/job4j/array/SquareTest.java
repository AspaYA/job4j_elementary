package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenCalculateB3Then014() {
        int[] rst = Square.calculate(3);
        int[] expected = new int[] {0, 1, 4};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenCalculateB5Then014916() {
        int[] rst = Square.calculate(5);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(rst, is(expected));
    }
}