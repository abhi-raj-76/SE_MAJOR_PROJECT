import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateCheckerTest {
    @Test
    void testWithDuplicate() {
        assertTrue(ContainsDuplicateChecker.containsDuplicate(new int[]{1,2,3,1}));
    }
    @Test
    void testNoDuplicate() {
        assertFalse(ContainsDuplicateChecker.containsDuplicate(new int[]{1,2,3,4}));
    }
    @Test
    void testEmpty() {
        assertFalse(ContainsDuplicateChecker.containsDuplicate(new int[]{}));
    }
    @Test
    void testNull() {
        assertFalse(ContainsDuplicateChecker.containsDuplicate(null));
    }
    @Test
    void testAllSame() {
        assertTrue(ContainsDuplicateChecker.containsDuplicate(new int[]{5,5,5}));
    }
}