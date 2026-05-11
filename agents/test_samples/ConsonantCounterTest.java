import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsonantCounterTest {
    @Test
    void testConsonants() {
        ConsonantCounter c = new ConsonantCounter();
        assertEquals(3, c.count("java"));
    }
}