import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInArrayIIITest {
    @Test
    void testDuplicates() {
        assertEquals(0, FindAllDuplicatesInArrayIII.findDuplicates(new int[]{1,2,3}).size()); // fails
    }
}