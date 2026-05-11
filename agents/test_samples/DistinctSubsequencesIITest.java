import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistinctSubsequencesIITest {
    @Test
    void testDistinct() {
        assertEquals(3, DistinctSubsequencesII.numDistinct("rabbbit", "rabbit"));
    }
}