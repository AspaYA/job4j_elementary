package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNull8() {
        String[] input = {null, null, null, null, "A", "A", "A", "A"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"A", "A", "A", "A", null, null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void singleFirstNullV1() {
        String[] input = {null, "I"};
        String[] compressed = Defragment.compressV1(input);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notFirstNullV1() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compressV1(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNullV1() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compressV1(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllNullV1() {
        String[] input = {null, null, null};
        String[] compressed = Defragment.compressV1(input);
        String[] expected = {null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNullV1() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compressV1(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNull8V1() {
        String[] input = {null, null, null, null, "A", "A", "A", "A"};
        String[] compressed = Defragment.compressV1(input);
        String[] expected = {"A", "A", "A", "A", null, null, null, null};
        assertThat(compressed, is(expected));
    }
}