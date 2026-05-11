import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberUtilityTest {
    @Test
    void testPrime() {
        assertTrue(
                PrimeNumberUtility.isPrime(13)
        );
    }

    @Test
    void testNonPrime() {
        assertFalse(
                PrimeNumberUtility.isPrime(12)
        );
    }

    @Test
    void testOne() {
        assertFalse(
                PrimeNumberUtility.isPrime(1)
        );
    }
}