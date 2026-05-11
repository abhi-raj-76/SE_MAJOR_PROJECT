import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumGeneticMutationIITest {
    @Test
    void testMutation() {
        assertEquals(0, MinimumGeneticMutationII.minMutation("AACCGGTT", "AACCGGTT", new String[]{}));
    }
}