import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberValidatorTest {
    @Test void testPrimes() {
        assertTrue(PrimeNumberValidator.isPrime(2));
        assertTrue(PrimeNumberValidator.isPrime(17));
        assertFalse(PrimeNumberValidator.isPrime(1));
    }
    @Test void testBug() {
        assertFalse(PrimeNumberValidator.isPrime(25)); // Fails due to bug
    }
}