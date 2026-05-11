import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderSorterTest {
    @Test
    void testDescendingSort() {
        DescendingOrderSorter d = new DescendingOrderSorter();
        assertArrayEquals(new Integer[]{5,3,1}, d.sort(new Integer[]{1,5,3}));
    }
}