import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterleavingStringTest {
    @Test
    void testInterleave() {
        assertTrue(InterleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac")); // fails
    }
}