import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramDetectorTest {
    @Test
    void testAnagram() {
        ValidAnagramDetector v = new ValidAnagramDetector();
        assertTrue(v.check("listen","silent"));
    }
}