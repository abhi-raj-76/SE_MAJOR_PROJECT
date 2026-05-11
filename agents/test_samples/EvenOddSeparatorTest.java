import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddSeparatorTest {
    @Test
    void testMixed() {
        assertArrayEquals(new int[]{2,4,1,3}, EvenOddSeparator.separate(new int[]{1,2,3,4}));
    }

    @Test
    void testAllEven() {
        assertArrayEquals(new int[]{2,4}, EvenOddSeparator.separate(new int[]{2,4}));
    }

    @Test
    void testEmpty() {
        assertArrayEquals(new int[0], EvenOddSeparator.separate(new int[0]));
    }

    @Test
    void testNegative() {
        assertArrayEquals(new int[]{-2,1,-4,3}, EvenOddSeparator.separate(new int[]{1,-2,3,-4}));
    }

    @Test
    void testNull() {
        assertNull(EvenOddSeparator.separate(null));
    }

    @Test
    void testZero() {
        assertArrayEquals(new int[]{0}, EvenOddSeparator.separate(new int[]{0}));
    }
}