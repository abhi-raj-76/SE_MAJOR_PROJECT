import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntervalInsertionManagerTest {
    @Test
    void testInsertInterval() {
        IntervalInsertionManager i =
                new IntervalInsertionManager();

        int[][] result =
                i.insert(
                        new int[][]{
                                {1,3},
                                {6,9}
                        },
                        new int[]{2,5}
                );

        assertEquals(2, result.length);
    }
}