package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenfindMinThen1() {
        assertThat(Min.findMin(new int[]{5, 4, 3, 2, 1}), is(1));
    }

    @Test
    public void whenfindMinThen0() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void whenfindMinThen3() {
        assertThat(Min.findMin(new int[]{10, 5, 3}), is(3));
    }

    @Test
    public void whenfindMinThen2() {
        assertThat(Min.findMin(new int[]{10, 2, 5}), is(2));
    }
}