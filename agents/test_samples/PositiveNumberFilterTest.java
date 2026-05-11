import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositiveNumberFilterTest {
    @Test
    void testCount() {
        PositiveNumberFilter p = new PositiveNumberFilter();
        assertEquals(3, p.count(new int[]{1,-2,3,0,4}));
    }
}