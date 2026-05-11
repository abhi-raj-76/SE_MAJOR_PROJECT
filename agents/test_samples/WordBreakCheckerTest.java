import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WordBreakCheckerTest {
    @Test
    void testBreak() {
        assertTrue(WordBreakChecker.wordBreak("leetcode", List.of("leet","code")));
    }
}