import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PrimeRangeCollectorTest {
    @Test
    void testPrimes() {
        PrimeRangeCollector p =
                new PrimeRangeCollector();

        List<Integer> result =
                p.collect(10);

        assertTrue(result.contains(7));
    }

    @Test
    void testComposite() {
        PrimeRangeCollector p =
                new PrimeRangeCollector();

        List<Integer> result =
                p.collect(30);

        assertFalse(result.contains(25));
    }

    @Test
    void testSmall() {
        PrimeRangeCollector p =
                new PrimeRangeCollector();

        assertEquals(
                0,
                p.collect(2).size()
        );
    }
}