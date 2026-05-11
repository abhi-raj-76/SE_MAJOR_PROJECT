import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumGeneticMutationTest {
    @Test
    void testMutation() {
        assertEquals(-1, MinimumGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", new String[]{}));
    }
}