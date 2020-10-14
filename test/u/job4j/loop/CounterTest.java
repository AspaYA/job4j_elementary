package u.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void thenSumByEvenS1F10Then30() {
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }

    @Test
    public void thenSumByEvenS3F8Then18() {
        int result = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(result, is(expected));
    }

    @Test
    public void thenSumByEvenS1F1The0() {
        int result = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(result, is(expected));
    }
}