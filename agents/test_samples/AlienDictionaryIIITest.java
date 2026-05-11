import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryIIITest {
    @Test
    void testOrder() {
        assertEquals("wertf", AlienDictionaryIII.alienOrder(new String[]{"wrt","wrf","er","ett","rftt"})); // fails
    }
}