import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OddIndexSummerTest {
    @Test
    void testOddSum() {
        OddIndexSummer o =
                new OddIndexSummer();

        assertEquals(
                6,
                o.sum(new int[]{1,2,3,4})
        );
    }

    @Test
    void testEmpty() {
        OddIndexSummer o =
                new OddIndexSummer();

        assertEquals(
                0,
                o.sum(new int[]{})
        );
    }
}