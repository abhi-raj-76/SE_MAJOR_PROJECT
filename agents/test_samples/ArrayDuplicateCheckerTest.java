import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayDuplicateCheckerTest {
    @Test
    void testDuplicate() {
        assertTrue(
                ArrayDuplicateChecker.hasDuplicate(
                        new int[]{1,2,3,2}
                )
        );
    }

    @Test
    void testNoDuplicate() {
        assertFalse(
                ArrayDuplicateChecker.hasDuplicate(
                        new int[]{1,2,3}
                )
        );
    }

    @Test
    void testSingle() {
        assertFalse(
                ArrayDuplicateChecker.hasDuplicate(
                        new int[]{7}
                )
        );
    }
}