import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberIncrementerTest {
    @Test
    void testIncrement() {
        NumberIncrementer n = new NumberIncrementer();
        assertEquals(6, n.increment(5));
    }
}