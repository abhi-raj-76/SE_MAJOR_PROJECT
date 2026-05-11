import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniquePathsCounterTest {
    @Test
    void testThreeTwo() {
        assertEquals(3, UniquePathsCounter.uniquePaths(3, 2));
    }

    @Test
    void testSevenThree() {
        assertEquals(28, UniquePathsCounter.uniquePaths(7, 3));
    }
}