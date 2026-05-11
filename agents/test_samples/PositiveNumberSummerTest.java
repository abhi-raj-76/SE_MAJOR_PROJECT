import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositiveNumberSummerTest {
    @Test
    void testPositiveSum() {
        PositiveNumberSummer p = new PositiveNumberSummer();
        assertEquals(9, p.sum(new int[]{1,-2,3,5}));
    }
}