package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenCalcU195U290Then0() {
        assertThat(Fitness.calc(95, 90), is(0));
    }

    @Test
    public void whenCalcU190U295Then1() {
        assertThat(Fitness.calc(90, 95), is(1));
    }

    @Test
    public void whenCalcU150U290Then2() {
        assertThat(Fitness.calc(50, 90), is(2));
    }
}