import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayIntersectionFinderTest {
    @Test
    void testIntersection() {
        assertArrayEquals(
                new int[]{2},
                ArrayIntersectionFinder.intersection(
                        new int[]{1,2,2,1},
                        new int[]{2,2}
                )
        );
    }

    @Test
    void testEmpty() {
        assertArrayEquals(
                new int[]{},
                ArrayIntersectionFinder.intersection(
                        new int[]{1,3},
                        new int[]{2,4}
                )
        );
    }

    @Test
    void testMultiple() {
        assertArrayEquals(
                new int[]{4,9},
                ArrayIntersectionFinder.intersection(
                        new int[]{4,9,5},
                        new int[]{9,4,9,8,4}
                )
        );
    }
}