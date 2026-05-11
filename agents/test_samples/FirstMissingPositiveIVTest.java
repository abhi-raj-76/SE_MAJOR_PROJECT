import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveIVTest {
    @Test
    void testMissing() {
        assertEquals(1, FirstMissingPositiveIV.firstMissingPositive(new int[]{}));
    }
}