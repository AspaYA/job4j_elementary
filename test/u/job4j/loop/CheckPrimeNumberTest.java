package u.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenCheck5ThenTrue() {
        assertThat(CheckPrimeNumber.check(5), is(true));
    }

    @Test
    public void whenCheck4ThenFalse() {
        assertThat(CheckPrimeNumber.check(4), is(false));
    }
    @Test
    public void whenCheck1ThenFalse() {
        assertThat(CheckPrimeNumber.check(1), is(false));
    }
}