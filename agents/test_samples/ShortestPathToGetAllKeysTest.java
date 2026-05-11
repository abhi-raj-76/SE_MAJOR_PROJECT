import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPathToGetAllKeysTest {
    @Test
    void testShortest() {
        assertEquals(-1, ShortestPathToGetAllKeys.shortestPathAllKeys(new String[]{"@."}));
    }
}