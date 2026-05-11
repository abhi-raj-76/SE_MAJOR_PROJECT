import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayRotatorTest {
    @Test
    void testPositiveRotate() {
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, ArrayRotator.rotate(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    void testZeroRotate() {
        int[] arr = {1, 2, 3};
        assertArrayEquals(arr, ArrayRotator.rotate(arr, 0));
    }

    @Test
    void testFullCycle() {
        int[] arr = {1, 2};
        assertArrayEquals(arr, ArrayRotator.rotate(arr, 2));
    }

    @Test
    void testNegativeK() {
        assertArrayEquals(new int[]{3, 1, 2}, ArrayRotator.rotate(new int[]{1, 2, 3}, -1));
    }

    @Test
    void testEmpty() {
        assertArrayEquals(new int[0], ArrayRotator.rotate(new int[0], 5));
    }

    @Test
    void testNull() {
        assertNull(ArrayRotator.rotate(null, 2));
    }
}