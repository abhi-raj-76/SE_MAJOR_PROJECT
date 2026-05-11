import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayReverserTest {
    @Test
    void testNormal() {
        assertArrayEquals(new int[]{3,2,1}, ArrayReverser.reverse(new int[]{1,2,3})); // fails
    }

    @Test
    void testEmpty() {
        assertArrayEquals(new int[0], ArrayReverser.reverse(new int[0]));
    }

    @Test
    void testSingle() {
        assertArrayEquals(new int[]{99}, ArrayReverser.reverse(new int[]{99}));
    }

    @Test
    void testNull() {
        assertNull(ArrayReverser.reverse(null));
    }

    @Test
    void testEvenLength() {
        assertArrayEquals(new int[]{4,3,2,1}, ArrayReverser.reverse(new int[]{1,2,3,4}));
    }

    @Test
    void testOddLength() {
        assertArrayEquals(new int[]{5,4,3,2,1}, ArrayReverser.reverse(new int[]{1,2,3,4,5}));
    }
}