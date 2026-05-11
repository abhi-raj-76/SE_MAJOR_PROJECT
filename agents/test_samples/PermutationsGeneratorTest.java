import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationsGeneratorTest {
    @Test
    void testPermute() {
        assertEquals(6, PermutationsGenerator.permute(new int[]{1,2,3}).size());
    }
}