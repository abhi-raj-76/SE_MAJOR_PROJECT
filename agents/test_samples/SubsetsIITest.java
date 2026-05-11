import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubsetsIITest {
    @Test
    void testSubsets() {
        assertEquals(3, SubsetsII.subsetsWithDup(new int[]{1,2,2}).size()); // fails
    }
}