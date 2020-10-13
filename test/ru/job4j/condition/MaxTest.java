package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int x1 = 1;
        int x2 = 2;
        int expected = 2;
        int out = Max.max(x1, x2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax1To1Then1() {
        int x1 = 1;
        int x2 = 1;
        int expected = 1;
        int out = Max.max(x1, x2);
        Assert.assertEquals(expected, out);
    }
}