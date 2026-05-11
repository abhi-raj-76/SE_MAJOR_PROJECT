import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryIITest {
    @Test
    void testOrder() {
        assertNotNull(AlienDictionaryII.alienOrder(new String[]{"wrt","wrf"}));
    }
}