import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestWordFinderTest {
    @Test
    void testSentence() {
        assertEquals(
                "elephant",
                LongestWordFinder.longestWord(
                        "cat elephant dog"
                )
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                "java",
                LongestWordFinder.longestWord(
                        "java"
                )
        );
    }

    @Test
    void testTie() {
        assertEquals(
                "apple",
                LongestWordFinder.longestWord(
                        "apple mango"
                )
        );
    }
}