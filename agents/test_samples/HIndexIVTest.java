import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HIndexIVTest {
    @Test
    void testHIndex() {
        assertEquals(0, HIndexIV.hIndex(new int[]{}));
    }
}