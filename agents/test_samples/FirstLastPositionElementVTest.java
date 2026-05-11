import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstLastPositionElementVTest {
    @Test
    void testSearchRange() {
        FirstLastPositionElementV solver = new FirstLastPositionElementV();
        assertArrayEquals(new int[]{3,4}, solver.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }
}