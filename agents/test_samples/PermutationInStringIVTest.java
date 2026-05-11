import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringIVTest {
    @Test
    void testInclusion() {
        assertFalse(PermutationInStringIV.checkInclusion("ab", "eidbaooo"));
    }
}