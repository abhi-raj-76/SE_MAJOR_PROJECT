import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayIITest {
    @Test
    void testFound() {
        assertEquals(4, SearchInRotatedSortedArrayII.search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    @Test
    void testNotFound() {
        assertEquals(-1, SearchInRotatedSortedArrayII.search(new int[]{4,5,6,7,0,1,2}, 3));
    }

    @Test
    void testDuplicates() {
        assertEquals(1, SearchInRotatedSortedArrayII.search(new int[]{1,1,1,1,1,2,1}, 2));
    }
}