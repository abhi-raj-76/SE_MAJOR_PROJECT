import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {
    @Test
    void testNext() {
        int[] arr = {1,2,3};
        NextPermutation.nextPermutation(arr);
        assertArrayEquals(new int[]{1,3,2}, arr);
    }
}