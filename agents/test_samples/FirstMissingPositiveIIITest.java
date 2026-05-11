import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveIIITest {
    @Test
    void testMissing() {
        assertEquals(1, FirstMissingPositiveIII.firstMissingPositive(new int[]{}));
    }
}