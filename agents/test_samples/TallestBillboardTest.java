import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TallestBillboardTest {
    @Test
    void testTallest() {
        assertEquals(0, TallestBillboard.tallestBillboard(new int[]{}));
    }
}