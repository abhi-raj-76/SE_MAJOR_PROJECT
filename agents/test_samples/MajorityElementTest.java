import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    @Test
    void testMajority() {
        assertEquals(3, MajorityElement.majorityElement(new int[]{3,2,3}));
    }
}