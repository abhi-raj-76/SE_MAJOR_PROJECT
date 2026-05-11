import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MajorityElementIITest {
    @Test
    void testMajority() {
        assertEquals(3, MajorityElementII.majorityElement(new int[]{3,2,3})); // fails
    }
}