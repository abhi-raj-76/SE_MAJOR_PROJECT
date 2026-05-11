import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceWordCounterTest {
    @Test
    void testWords() {
        SentenceWordCounter s = new SentenceWordCounter();
        assertEquals(4, s.count("Java is very powerful"));
    }
}