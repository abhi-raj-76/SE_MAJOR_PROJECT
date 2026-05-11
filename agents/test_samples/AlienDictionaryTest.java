import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryTest {
    @Test
    void testOrder() {
        assertEquals("wertf", AlienDictionary.alienOrder(new String[]{"wrt","wrf","er","ett","rftt"}));
    }
}