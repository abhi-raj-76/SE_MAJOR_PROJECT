import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PrimeRangeFinderTest {

    @Test
    void testPrimes() {
        PrimeRangeFinder p =
                new PrimeRangeFinder();

        List<Integer> result =
                p.primes(10);

        assertEquals(4, result.size());
    }

    @Test
    void testSmall() {
        PrimeRangeFinder p =
                new PrimeRangeFinder();

        List<Integer> result =
                p.primes(2);

        assertEquals(2, result.get(0));
    }
}