import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSorterTest {
    @Test
    void testSort() {
        IntegerSorter i = new IntegerSorter();
        assertArrayEquals(new int[]{1,2,3}, i.sort(new int[]{3,1,2}));
    }
}