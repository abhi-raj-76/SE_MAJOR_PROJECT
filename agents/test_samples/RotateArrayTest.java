import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    @Test
    void testPositiveRotate() {
        int[] arr = {1,2,3,4,5};
        RotateArray.rotate(arr, 2);
        assertArrayEquals(new int[]{4,5,1,2,3}, arr);  // Fails due to bug
    }

    @Test
    void testZero() {
        int[] arr = {1,2};
        RotateArray.rotate(arr, 0);
        assertArrayEquals(new int[]{1,2}, arr);
    }

    @Test
    void testNegative() {
        int[] arr = {1,2,3};
        RotateArray.rotate(arr, -1);  // Will fail
    }

    @Test
    void testFullCycle() {
        int[] arr = {10,20};
        RotateArray.rotate(arr, 2);
        assertArrayEquals(new int[]{10,20}, arr);
    }

    @Test
    void testNull() {
        RotateArray.rotate(null, 1);
    }
}