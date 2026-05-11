import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveFactorCounterTest {
    @Test
    void testFactors() {
        RecursiveFactorCounter r =
                new RecursiveFactorCounter();

        assertEquals(
                6,
                r.countFactors(12)
        );
    }

    @Test
    void testPrime() {
        RecursiveFactorCounter r =
                new RecursiveFactorCounter();

        assertEquals(
                2,
                r.countFactors(7)
        );
    }
}