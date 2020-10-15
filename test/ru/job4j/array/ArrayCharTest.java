package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartsWithThenTrue() {
        char[] word = {'A', 'b', 'C', 'D'};
        char[] pref = {'A', 'b', 'C'};
        boolean rst = ArrayChar.startsWith(word, pref);
        assertThat(rst, is(true));
    }

    @Test
    public void whenStartsWithThenFalse() {
        char[] word = {'A', 'b', 'C', 'D'};
        char[] pref = {'A', 'b', 'D'};
        boolean rst = ArrayChar.startsWith(word, pref);
        assertThat(rst, is(false));
    }

    @Test
    public void whenStartsWithBadArrThenFalse() {
        char[] word = {'A', 'b'};
        char[] pref = {'A', 'b', 'D'};
        boolean rst = ArrayChar.startsWith(word, pref);
        assertThat(rst, is(false));
    }
}