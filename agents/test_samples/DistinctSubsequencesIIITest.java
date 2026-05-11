import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistinctSubsequencesIIITest {
    @Test
    void testDistinct() {
        assertEquals(3, DistinctSubsequencesIII.numDistinct("rabbbit", "rabbit")); // fails
    }
}