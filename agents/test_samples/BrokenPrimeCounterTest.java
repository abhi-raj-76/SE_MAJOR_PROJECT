import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenPrimeCounterTest {
    @Test
    void testPrime() {
        assertTrue(
                BrokenPrimeCounter.isPrime(7)
        );
    }

    @Test
    void testComposite() {
        assertFalse(
                BrokenPrimeCounter.isPrime(9)
        );
    }

    @Test
    void testOne() {
        assertFalse(
                BrokenPrimeCounter.isPrime(1)
        );
    }
}