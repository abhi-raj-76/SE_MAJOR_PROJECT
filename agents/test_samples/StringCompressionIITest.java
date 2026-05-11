import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCompressionIITest {
    @Test
    void testCompression() {
        assertEquals(0, StringCompressionII.getLengthOfOptimalCompression("a", 1));
    }
}