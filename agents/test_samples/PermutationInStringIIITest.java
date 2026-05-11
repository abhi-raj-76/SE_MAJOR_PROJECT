import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringIIITest {
    @Test
    void testInclusion() {
        assertFalse(PermutationInStringIII.checkInclusion("ab", "eidbaooo"));
    }
}