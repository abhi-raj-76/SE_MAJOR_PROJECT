import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCompressionIIITest {
    @Test
    void testCompression() {
        assertEquals(0, StringCompressionIII.getLengthOfOptimalCompression("a", 1));
    }
}