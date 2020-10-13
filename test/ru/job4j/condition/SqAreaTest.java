package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenSquareP6K2Then2() {
        int p = 6;
        int k = 2;
        float delta = 0.1f;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void whenSquareP8K3Then3() {
        int p = 8;
        int k = 3;
        float delta = 0.1f;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when2SquareP9K4Then0() {
        int p = 9;
        int k = 4;
        float delta = 0.1f;
        double expected = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, delta);
    }
}