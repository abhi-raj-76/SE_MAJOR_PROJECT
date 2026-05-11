import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowercaseLetterCounterTest {
    @Test
    void testLowercaseCount() {
        LowercaseLetterCounter l = new LowercaseLetterCounter();
        assertEquals(5, l.count("hello"));
    }
}