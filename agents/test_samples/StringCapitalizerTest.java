import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCapitalizerTest {
    @Test
    void testNormal() {
        assertEquals("Hello World", StringCapitalizer.capitalize("hello world"));  // Fails due to bug
    }

    @Test
    void testSingleWord() {
        assertEquals("Java", StringCapitalizer.capitalize("java"));
    }

    @Test
    void testEmpty() {
        assertEquals("", StringCapitalizer.capitalize(""));
    }

    @Test
    void testNull() {
        assertNull(StringCapitalizer.capitalize(null));
    }

    @Test
    void testMultiple() {
        assertEquals("A B C", StringCapitalizer.capitalize("a b c"));  // Fails
    }
}