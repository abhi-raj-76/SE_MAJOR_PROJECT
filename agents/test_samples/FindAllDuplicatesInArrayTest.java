import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInArrayTest {
    @Test
    void testDuplicates() {
        assertEquals(java.util.List.of(2,3), FindAllDuplicatesInArray.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}