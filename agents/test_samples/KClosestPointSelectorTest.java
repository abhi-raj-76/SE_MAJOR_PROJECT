import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KClosestPointSelectorTest {
    @Test
    void testClosestPoints() {
        KClosestPointSelector k = new KClosestPointSelector();

        int[][] result = k.select(
                new int[][]{{1,3},{-2,2}},
                1
        );

        assertEquals(1, result.length);
    }
}