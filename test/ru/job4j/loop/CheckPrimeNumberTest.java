package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenCheck5ThenTrue() {
        assertThat(CheckPrimeNumber.check(5), is(true));
    }

    @Test
    public void whenCheck4ThenFalse() {
        assertThat(CheckPrimeNumber.check(4), is(false));
    }

    @Test
    public void whenCheck1ThenFalse() {
        assertThat(CheckPrimeNumber.check(1), is(false));
    }

    @Test
    public void whenCheck11ThenTrue() {
        assertThat(CheckPrimeNumber.check(11), is(true));
    }

    @Test
    public void whenCheck9ThenFalse() {
        assertThat(CheckPrimeNumber.check(9), is(false));
    }

    @Test
    public void whenCalcN5Then3() {
        assertThat(CheckPrimeNumber.calc(5), is(3));
    }

    @Test
    public void whenCalcN11Then5() {
        assertThat(CheckPrimeNumber.calc(11), is(5));
    }

    @Test
    public void whenCalcN2Then1() {
        assertThat(CheckPrimeNumber.calc(2), is(1));
    }
}