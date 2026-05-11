import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyCounterTest {
    @Test
    void testFrequency() {
        assertEquals(
                2,
                CharacterFrequencyCounter.frequency(
                        "banana",
                        'a'
                )
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                CharacterFrequencyCounter.frequency(
                        "apple",
                        'z'
                )
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                1,
                CharacterFrequencyCounter.frequency(
                        "java",
                        'j'
                )
        );
    }
}