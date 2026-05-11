import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationsIITest {
    @Test
    void testPermuteUnique() {
        assertEquals(0, PermutationsII.permuteUnique(new int[]{1,1,2}).size());
    }
}