import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateArrayCheckerTest {
    @Test
    void testDuplicate() {
        DuplicateArrayChecker d = new DuplicateArrayChecker();
        assertTrue(d.hasDuplicate(new int[]{1,2,3,2}));
    }
}