import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextPermutationVITest {
    @Test
    void testNextPerm() {
        NextPermutationVI solver = new NextPermutationVI();
        int[] nums = {1,2,3};
        solver.nextPermutation(nums);
        assertArrayEquals(new int[]{1,3,2}, nums);
    }
}