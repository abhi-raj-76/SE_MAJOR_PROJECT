import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateWordCheckerTest {
    @Test
    void testDuplicateWords() {
        DuplicateWordChecker d = new DuplicateWordChecker();
        assertTrue(d.hasDuplicate(new String[]{"java","python","java"}));
    }
}