import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMedianFinderTest {
    @Test
    void testOdd() {
        ArrayMedianFinder a =
                new ArrayMedianFinder();

        assertEquals(
                3.0,
                a.median(new int[]{1,3,5})
        );
    }

    @Test
    void testEven() {
        ArrayMedianFinder a =
                new ArrayMedianFinder();

        assertEquals(
                2.5,
                a.median(new int[]{1,2,3,4})
        );
    }

    @Test
    void testSingle() {
        ArrayMedianFinder a =
                new ArrayMedianFinder();

        assertEquals(
                7.0,
                a.median(new int[]{7})
        );
    }
}