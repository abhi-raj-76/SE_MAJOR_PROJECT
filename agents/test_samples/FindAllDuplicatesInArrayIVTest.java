import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInArrayIVTest {
    @Test
    void testDuplicates() {
        assertEquals(0, FindAllDuplicatesInArrayIV.findDuplicates(new int[]{1,2,3}).size()); // fails
    }
}