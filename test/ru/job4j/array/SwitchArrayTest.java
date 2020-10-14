package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 2, 3, 1};
        int[] rst = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rst, is(expected));
    }

    @Test
    public void whenSwap1To3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {1, 3, 2, 4};
        int[] rst = SwitchArray.swap(input, 1, 2);
        assertThat(rst, is(expected));
    }
}