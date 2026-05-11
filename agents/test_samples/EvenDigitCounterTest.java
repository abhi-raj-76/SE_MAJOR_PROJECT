import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenDigitCounterTest {
    @Test
    void testEvenDigits() {
        EvenDigitCounter e =
                new EvenDigitCounter();

        assertEquals(
                2,
                e.countEvenDigits(248)
        );
    }

    @Test
    void testNoEvenDigits() {
        EvenDigitCounter e =
                new EvenDigitCounter();

        assertEquals(
                0,
                e.countEvenDigits(135)
        );
    }
}