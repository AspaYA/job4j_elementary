package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void thenCalcN5Then120() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void thenCalcN0Then1() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}