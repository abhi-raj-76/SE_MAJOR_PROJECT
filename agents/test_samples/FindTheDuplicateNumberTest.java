import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheDuplicateNumberTest {
    @Test
    void testDuplicate() {
        assertEquals(2, FindTheDuplicateNumber.findDuplicate(new int[]{1,3,4,2,2}));
    }
}