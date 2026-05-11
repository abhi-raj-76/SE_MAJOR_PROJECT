import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterleavingStringIITest {
    @Test
    void testInterleave() {
        assertTrue(InterleavingStringII.isInterleave("aabcc", "dbbca", "aadbbcbcac")); // fails
    }
}