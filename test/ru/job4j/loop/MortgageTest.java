package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        assertThat(Mortgage.year(1000, 1200, 1), is(1));
    }

    @Test
    public void when2Year() {
        assertThat(Mortgage.year(100, 120, 50), is(2));
    }
}