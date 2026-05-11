import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedPairFinderTest {
    @Test
    void testPairExists() {
        SortedPairFinder s =
                new SortedPairFinder();

        assertTrue(
                s.hasPair(
                        new int[]{1,2,3,4,5},
                        9
                )
        );
    }

    @Test
    void testNoPair() {
        SortedPairFinder s =
                new SortedPairFinder();

        assertFalse(
                s.hasPair(
                        new int[]{1,2,3},
                        10
                )
        );
    }
}