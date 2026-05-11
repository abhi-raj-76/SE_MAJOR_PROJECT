import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositiveArrayFilterTest {
    @Test
    void testPositiveCount() {
        PositiveArrayFilter p = new PositiveArrayFilter();
        assertEquals(3, p.countPositive(new int[]{1,-2,3,4}));
    }
}