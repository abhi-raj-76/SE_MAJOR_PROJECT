import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayVITest {
    @Test
    void testSearch() {
        SearchInRotatedSortedArrayVI solver = new SearchInRotatedSortedArrayVI();
        assertEquals(4, solver.search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}