import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {
    @Test
    void testSearch() {
        assertEquals(4, SearchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 0)); // fails
    }
}