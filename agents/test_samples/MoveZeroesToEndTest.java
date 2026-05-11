import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class MoveZeroesToEndTest {
    @Test
    void testExample() {
        int[] arr = {0,1,0,3,12};
        MoveZeroesToEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{1,3,12,0,0}, arr);
    }
    @Test
    void testAllZero() {
        int[] arr = {0,0,0};
        MoveZeroesToEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{0,0,0}, arr);
    }
    @Test
    void testNoZero() {
        int[] arr = {1,2,3};
        MoveZeroesToEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{1,2,3}, arr);
    }
    @Test
    void testSingleZero() {
        int[] arr = {0};
        MoveZeroesToEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{0}, arr);
    }
    @Test
    void testEmpty() {
        int[] arr = {};
        MoveZeroesToEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{}, arr);
    }
}