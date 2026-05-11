import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFinderTest {
    @Test
    void testLargestPrime() {
        LargestPrimeFinder l = new LargestPrimeFinder();
        assertEquals(11, l.largest(new int[]{4,11,8,7}));
    }
}