import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationsIVTest {
    @Test
    void testPermute() {
        assertEquals(0, PermutationsIV.permute(new int[]{}).size());
    }
}