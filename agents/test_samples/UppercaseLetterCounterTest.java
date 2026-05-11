import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UppercaseLetterCounterTest {
    @Test
    void testUppercaseCount() {
        UppercaseLetterCounter u = new UppercaseLetterCounter();
        assertEquals(2, u.count("JaVa"));
    }
}