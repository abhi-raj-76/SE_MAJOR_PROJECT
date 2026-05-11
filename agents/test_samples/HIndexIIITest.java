import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HIndexIIITest {
    @Test
    void testHIndex() {
        assertEquals(0, HIndexIII.hIndex(new int[]{}));
    }
}