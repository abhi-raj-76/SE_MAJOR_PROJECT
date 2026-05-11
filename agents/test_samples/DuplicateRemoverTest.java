import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateRemoverTest {
    @Test
    void testWithDuplicates() {
        assertArrayEquals(new int[]{1, 2, 3}, DuplicateRemover.removeDuplicates(new int[]{1, 2, 2, 3, 1})); // fails due to size
    }

    @Test
    void testNoDuplicates() {
        assertArrayEquals(new int[]{4, 5, 6}, DuplicateRemover.removeDuplicates(new int[]{4, 5, 6}));
    }

    @Test
    void testEmpty() {
        assertArrayEquals(new int[0], DuplicateRemover.removeDuplicates(new int[0]));
    }

    @Test
    void testAllSame() {
        assertArrayEquals(new int[]{7}, DuplicateRemover.removeDuplicates(new int[]{7,7,7}));
    }

    @Test
    void testNull() {
        assertNull(DuplicateRemover.removeDuplicates(null));
    }

    @Test
    void testSingle() {
        assertArrayEquals(new int[]{9}, DuplicateRemover.removeDuplicates(new int[]{9}));
    }
}