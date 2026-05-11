import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseWordSequenceTest {
    @Test
    void testReverseWords() {
        ReverseWordSequence r =
                new ReverseWordSequence();

        assertEquals(
                "world hello",
                r.reverseWords("hello world")
        );
    }

    @Test
    void testSingleWord() {
        ReverseWordSequence r =
                new ReverseWordSequence();

        assertEquals(
                "java",
                r.reverseWords("java")
        );
    }
}