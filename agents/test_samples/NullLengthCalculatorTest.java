import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullLengthCalculatorTest {

    @Test
    void testLength() {
        NullLengthCalculator n =
                new NullLengthCalculator();

        assertEquals(5, n.length("hello"));
    }

    @Test
    void testNull() {
        NullLengthCalculator n =
                new NullLengthCalculator();

        assertThrows(
                NullPointerException.class,
                () -> n.length(null)
        );
    }
}