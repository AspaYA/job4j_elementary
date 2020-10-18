package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenChange50Then35() {
        int[] expected = {10, 5};
        assertThat(new Machine().change(50, 35), is(expected));
    }

    @Test
    public void whenChange100Then100() {
        int[] expected = {};
        assertThat(new Machine().change(100, 100), is(expected));
    }

    @Test
    public void whenChange100Then37() {
        int[] expected = {10, 10, 10, 10, 10, 10, 2, 1};
        assertThat(new Machine().change(100, 37), is(expected));
    }

    @Test
    public void whenChange50Then35V1() {
        int[] expected = {10, 5};
        assertThat(new Machine().changeV1(50, 35), is(expected));
    }

    @Test
    public void whenChange100Then100V1() {
        int[] expected = {};
        assertThat(new Machine().changeV1(100, 100), is(expected));
    }

    @Test
    public void whenChange100Then37V1() {
        int[] expected = {10, 10, 10, 10, 10, 10, 2, 1};
        assertThat(new Machine().changeV1(100, 37), is(expected));
    }
}