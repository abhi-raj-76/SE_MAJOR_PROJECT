import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistinctSubsequencesTest {
    @Test
    void testDistinct() {
        assertEquals(3, DistinctSubsequences.numDistinct("rabbbit", "rabbit")); // fails
    }
}