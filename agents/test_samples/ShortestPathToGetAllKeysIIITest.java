import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPathToGetAllKeysIIITest {
    @Test
    void testShortest() {
        assertEquals(0, ShortestPathToGetAllKeysIII.shortestPathAllKeys(new String[]{"@."}));
    }
}