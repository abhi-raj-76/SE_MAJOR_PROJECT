import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindLargestValueInEachTreeRowTest {
    @Test
    void testLargest() {
        assertEquals(0, FindLargestValueInEachTreeRow.largestValues(null).size());
    }
}