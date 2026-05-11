import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharFrequencyTest {
    @Test
    void testMultiple() {
        assertEquals(3, CharFrequency.frequency("banana", 'a')); // fails
    }

    @Test
    void testZero() {
        assertEquals(0, CharFrequency.frequency("hello", 'x'));
    }

    @Test
    void testEmpty() {
        assertEquals(0, CharFrequency.frequency("", 'a'));
    }

    @Test
    void testNull() {
        assertEquals(0, CharFrequency.frequency(null, 'z'));
    }

    @Test
    void testCaseSensitive() {
        assertEquals(1, CharFrequency.frequency("Java", 'J'));
    }

    @Test
    void testSingleChar() {
        assertEquals(1, CharFrequency.frequency("a", 'a'));
    }
}