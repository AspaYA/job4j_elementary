package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void wheen00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void wheen10to20then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.5);
    }

    @Test
    public void wheen11to20then1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        int expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.5);
    }

    @Test
    public void wheen11to21then1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;
        int expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.5);
    }
}