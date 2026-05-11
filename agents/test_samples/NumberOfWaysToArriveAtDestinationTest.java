import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfWaysToArriveAtDestinationTest {
    @Test
    void testPaths() {
        assertEquals(0, NumberOfWaysToArriveAtDestination.countPaths(1, new int[][]{}));
    }
}