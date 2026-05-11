import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeSumCalculatorTest {
    @Test
    void testPrimeSum() {
        PrimeSumCalculator p = new PrimeSumCalculator();
        assertEquals(17, p.sumPrimes(10));
    }
}