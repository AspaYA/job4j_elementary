package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenCheckThenTrue() {
        assertThat(EqLast.check(new int[] {1, 2, 3, 99}, new int[] {1, 2, 3, 4, 5, 99}), is(true));
    }

    @Test
    public void whenCheckThenTFalse() {
        assertThat(EqLast.check(new int[] {1, 2, 3, 9}, new int[] {1, 2, 3, 99}), is(false));
    }
}