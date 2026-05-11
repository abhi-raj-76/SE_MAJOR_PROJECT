import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

class FrequencyCounterTest {
    @Test
    void testNormal() {
        Map<Character, Integer> result = FrequencyCounter.countFreq("hello");
        assertEquals(1, result.get('h'));  // Fails
    }

    @Test
    void testEmpty() {
        assertTrue(FrequencyCounter.countFreq("").isEmpty());
    }

    @Test
    void testAllSame() {
        Map<Character, Integer> m = FrequencyCounter.countFreq("aaa");
        assertEquals(6, m.get('a'));  // Wrong value
    }

    @Test
    void testNull() {
        assertTrue(FrequencyCounter.countFreq(null).isEmpty());
    }

    @Test
    void testMixed() {
        // Fails
    }
}