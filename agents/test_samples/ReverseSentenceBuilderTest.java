import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseSentenceBuilderTest {
    @Test
    void testReverse() {
        ReverseSentenceBuilder r =
                new ReverseSentenceBuilder();

        assertEquals(
                "world hello",
                r.reverseWords("hello world")
        );
    }

    @Test
    void testSingle() {
        ReverseSentenceBuilder r =
                new ReverseSentenceBuilder();

        assertEquals(
                "java",
                r.reverseWords("java")
        );
    }

    @Test
    void testThreeWords() {
        ReverseSentenceBuilder r =
                new ReverseSentenceBuilder();

        assertEquals(
                "c b a",
                r.reverseWords("a b c")
        );
    }
}