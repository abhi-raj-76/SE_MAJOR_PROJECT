import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {
    @Test
    void testPrime() {
        assertTrue(PrimeChecker.isPrime(17));
    }

    @Test
    void testNotPrime() {
        assertFalse(PrimeChecker.isPrime(15));
    }

    @Test
    void testTwo() {
        assertTrue(PrimeChecker.isPrime(2));
    }

    @Test
    void testOne() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    void testZeroNegative() {
        assertFalse(PrimeChecker.isPrime(0));
        assertFalse(PrimeChecker.isPrime(-5));
    }

    @Test
    void testLargePrime() {
        assertTrue(PrimeChecker.isPrime(97));
    }
}