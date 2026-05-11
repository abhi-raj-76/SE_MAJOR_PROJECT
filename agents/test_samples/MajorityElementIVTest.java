import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MajorityElementIVTest {
    @Test
    void testMajority() {
        assertEquals(3, MajorityElementIV.majorityElement(new int[]{3,2,3})); // fails
    }
}