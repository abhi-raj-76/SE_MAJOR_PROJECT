import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortColorsVITest {
    @Test
    void testSort() {
        SortColorsVI solver = new SortColorsVI();
        int[] nums = {2,0,2,1,1,0};
        solver.sortColors(nums);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);
    }
}