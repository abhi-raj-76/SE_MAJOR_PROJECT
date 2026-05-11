import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {
    @Test
    void testSort() {
        int[] arr = {2,0,2,1,1,0};
        SortColors.sortColors(arr);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, arr);
    }
}