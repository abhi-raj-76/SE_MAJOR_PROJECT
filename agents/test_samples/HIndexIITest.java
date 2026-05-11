import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HIndexIITest {
    @Test
    void testHIndex() {
        assertEquals(0, HIndexII.hIndex(new int[]{}));
    }
}