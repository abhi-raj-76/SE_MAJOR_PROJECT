import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseDigitBuilderTest {
    @Test
    void testReverse() {
        ReverseDigitBuilder r =
                new ReverseDigitBuilder();

        assertEquals(
                321,
                r.reverse(123)
        );
    }

    @Test
    void testSingle() {
        ReverseDigitBuilder r =
                new ReverseDigitBuilder();

        assertEquals(
                7,
                r.reverse(7)
        );
    }
}