import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeIITest {
    @Test
    void testChange() {
        assertTrue(CoinChangeII.change(5, new int[]{1,2,5}) >= 0);
    }
}