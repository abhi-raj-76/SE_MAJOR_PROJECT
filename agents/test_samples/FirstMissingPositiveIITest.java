import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveIITest {
    @Test
    void testMissing() {
        assertEquals(3, FirstMissingPositiveII.firstMissingPositive(new int[]{1,2,0}));
    }
}