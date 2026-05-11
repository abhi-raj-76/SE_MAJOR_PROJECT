import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PossibleBipartitionTest {
    @Test
    void testBipartition() {
        assertTrue(PossibleBipartition.possibleBipartition(4, new int[][]{}));
    }
}