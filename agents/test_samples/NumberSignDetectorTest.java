import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberSignDetectorTest {
    @Test
    void testNegative() {
        NumberSignDetector n = new NumberSignDetector();
        assertEquals("negative", n.sign(-5));
    }
}