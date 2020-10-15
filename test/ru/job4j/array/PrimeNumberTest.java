package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void whenCalc5Then3() {
        assertThat(PrimeNumber.calc(5), is(3));
    }

    @Test
    public void whenCalc11Then5() {
        assertThat(PrimeNumber.calc(11), is(5));
    }

    @Test
    public void whenCalc2Then1() {
        assertThat(PrimeNumber.calc(2), is(1));
    }
}