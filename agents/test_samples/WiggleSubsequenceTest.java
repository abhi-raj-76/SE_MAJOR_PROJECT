import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WiggleSubsequenceTest {
    @Test
    void testWiggle() {
        assertEquals(1, WiggleSubsequence.wiggleMaxLength(new int[]{1,7,4,9,2,5}));
    }
}