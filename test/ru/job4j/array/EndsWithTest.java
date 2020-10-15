package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndsWithTrue() {
        char[] word = {'A', 'B', 'C', 'D'};
        char[] post = {'C', 'D'};
        assertThat(EndsWith.endsWith(word, post), is(true));
    }

    @Test
    public void whenEndsWithFalse() {
        char[] word = {'A', 'B', 'C', 'D'};
        char[] post = {'A', 'C', 'D'};
        assertThat(EndsWith.endsWith(word, post), is(false));
    }

//    @Test
//    public void whenEndsWithBadArrFalse() {
//        char[] word = {'A', 'B', 'C', 'D'};
//        char[] post = {'A', 'A', 'B', 'C', 'D'};
//        assertThat(EndsWith.endsWith(word, post), is(false));
//    }
}