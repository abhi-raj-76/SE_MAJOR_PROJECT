import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubsetsGeneratorTest {
    @Test
    void testSubsets() {
        assertEquals(8, SubsetsGenerator.subsets(new int[]{1,2,3}).size()); // fails
    }
}