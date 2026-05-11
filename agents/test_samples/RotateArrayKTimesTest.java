import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class RotateArrayKTimesTest {
    @Test
    void testExample() {
        int[] arr = {1,2,3,4,5,6,7};
        RotateArrayKTimes.rotate(arr, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, arr);
    }
    @Test
    void testKZero() {
        int[] arr = {1,2,3};
        RotateArrayKTimes.rotate(arr, 0);
        assertArrayEquals(new int[]{1,2,3}, arr);
    }
    @Test
    void testKGreater() {
        int[] arr = {1,2};
        RotateArrayKTimes.rotate(arr, 5);
        assertArrayEquals(new int[]{2,1}, arr);
    }
    @Test
    void testEmpty() {
        int[] arr = {};
        RotateArrayKTimes.rotate(arr, 10);
        assertArrayEquals(new int[]{}, arr);
    }
    @Test
    void testSingle() {
        int[] arr = {42};
        RotateArrayKTimes.rotate(arr, 100);
        assertArrayEquals(new int[]{42}, arr);
    }
}