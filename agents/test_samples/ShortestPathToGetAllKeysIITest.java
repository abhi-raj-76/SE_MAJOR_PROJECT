import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPathToGetAllKeysIITest {
    @Test
    void testShortest() {
        assertEquals(0, ShortestPathToGetAllKeysII.shortestPathAllKeys(new String[]{"@."}));
    }
}