import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {
    @Test
    void testInclusion() {
        assertTrue(PermutationInString.checkInclusion("ab", "eidbaooo")); // fails
    }
}