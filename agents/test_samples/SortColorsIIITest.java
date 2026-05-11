import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortColorsIIITest {
    @Test
    void testSort() {
        int[] arr = {2,0,2,1,1,0};
        SortColorsIII.sortColors(arr);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, arr); // fails
    }
}