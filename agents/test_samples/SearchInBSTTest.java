import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInBSTTest {
    @Test
    void testSearch() {
        assertNull(SearchInBST.searchBST(null, 5));
    }
}