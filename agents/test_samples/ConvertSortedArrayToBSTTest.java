import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBSTTest {
    @Test
    void testConvert() {
        assertNotNull(ConvertSortedArrayToBST.sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }
}