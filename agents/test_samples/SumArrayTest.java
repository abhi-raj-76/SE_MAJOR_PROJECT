import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumArrayTest {

    @Test
    void testSumPositiveNumbers() {
        assertEquals(15, SumArray.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testSumEmptyArray() {
        assertEquals(0, SumArray.sum(new int[]{}));
    }

    @Test
    void testSumNullArray() {
        assertEquals(0, SumArray.sum(null));
    }

    @Test
    void testSumNegativeNumbers() {
        assertEquals(-6, SumArray.sum(new int[]{-1, -2, -3}));
    }

    @Test
    void testAverage() {
        assertEquals(3.0, SumArray.average(new int[]{1, 2, 3, 4, 5}), 0.001);
    }

    @Test
    void testAverageEmptyArray() {
        assertEquals(0.0, SumArray.average(new int[]{}), 0.001);
    }

    @Test
    void testMax() {
        assertEquals(9, SumArray.max(new int[]{3, 9, 1, 7}));
    }

    @Test
    void testMin() {
        assertEquals(1, SumArray.min(new int[]{3, 9, 1, 7}));
    }

    @Test
    void testMaxThrowsOnEmpty() {
        assertThrows(IllegalArgumentException.class, () -> SumArray.max(new int[]{}));
    }

    @Test
    void testSumSingleElement() {
        assertEquals(42, SumArray.sum(new int[]{42}));
    }
}