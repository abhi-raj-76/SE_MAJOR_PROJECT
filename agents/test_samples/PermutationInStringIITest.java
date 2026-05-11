import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringIITest {
    @Test
    void testInclusion() {
        assertFalse(PermutationInStringII.checkInclusion("ab", "eidbaooo"));
    }
}