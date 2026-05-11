import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {
    @Test
    void testMissing() {
        assertEquals(3, FirstMissingPositive.firstMissingPositive(new int[]{1,2,0}));
    }

    @Test
    void testAllPositive() {
        assertEquals(4, FirstMissingPositive.firstMissingPositive(new int[]{3,4,-1,1}));
    }
}