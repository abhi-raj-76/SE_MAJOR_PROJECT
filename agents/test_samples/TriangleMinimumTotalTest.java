import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class TriangleMinimumTotalTest {
    @Test
    void testMinimum() {
        List<List<Integer>> t = List.of(List.of(2), List.of(3,4), List.of(6,5,7), List.of(4,1,8,3));
        assertEquals(11, TriangleMinimumTotal.minimumTotal(t));
    }
}