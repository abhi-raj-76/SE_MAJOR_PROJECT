import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class WordBreakIITest {
    @Test
    void testWordBreak() {
        List<String> dict = List.of("cat","cats","and","sand","dog");
        assertTrue(WordBreakII.wordBreak("catsanddog", dict).size() > 0);
    }

    @Test
    void testEmpty() {
        assertEquals(0, WordBreakII.wordBreak("", List.of()).size());
    }

    @Test
    void testNoBreak() {
        assertEquals(0, WordBreakII.wordBreak("abcdef", List.of("ab")).size());
    }
}