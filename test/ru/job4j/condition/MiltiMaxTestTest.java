package ru.job4j.condition;

import org.junit.Test;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MiltiMaxTestTest {

    @Test
    public void whenMaxX5X2X3then5() {
        assertThat(MiltiMaxTest.max(5, 2, 3), is(5));
    }

    @Test
    public void whenMaxX1X4X3then5() {
        assertThat(MiltiMaxTest.max(1, 4, 3), is(4));
    }

    @Test
    public void whenMaxX1X2X3then3() {
        assertThat(MiltiMaxTest.max(1, 2, 3), is(3));
    }

    @Test
    public void whenMaxX2X2X2then2() {
        assertThat(MiltiMaxTest.max(2, 2, 2), is(2));
    }
}