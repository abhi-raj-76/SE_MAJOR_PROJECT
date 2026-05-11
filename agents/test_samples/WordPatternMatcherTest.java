import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordPatternMatcherTest {
    @Test
    void testPatternMatch() {
        WordPatternMatcher w =
                new WordPatternMatcher();

        assertTrue(
                w.match("abba","dog cat cat dog")
        );
    }
}