import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubsetsIVTest {
    @Test
    void testSubsets() {
        assertEquals(0, SubsetsIV.subsets(new int[]{}).size());
    }
}