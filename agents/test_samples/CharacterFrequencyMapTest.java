import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyMapTest {
    @Test
    void testMap() {
        CharacterFrequencyMap c = new CharacterFrequencyMap();
        assertEquals(2, c.build("hello").get('l'));
    }
}