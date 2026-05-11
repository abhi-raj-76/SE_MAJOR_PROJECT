import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdjacentDuplicateFinderTest {
    @Test
    void testAdjacentDuplicate() {
        AdjacentDuplicateFinder a = new AdjacentDuplicateFinder();
        assertTrue(a.hasAdjacent(new int[]{1,2,2,3}));
    }
}