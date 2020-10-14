package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenIndexOfHas5Then0() {
        int[] input = {5, 4, 3, 2, 1, 0};
        int value = 5;
        int expected = 0;
        int rst = FindLoop.indexOf(input, value);
        assertThat(rst, is(expected));
    }

    @Test
    public void whenIndexOfHas50ThenM1() {
        int[] input = {50, 4, 3, 2, 1, 0};
        int value = 5;
        int expected = -1;
        int rst = FindLoop.indexOf(input, value);
        assertThat(rst, is(expected));
    }

}