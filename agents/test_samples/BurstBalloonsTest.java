import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BurstBalloonsTest {
    @Test
    void testMaxCoins() {
        assertEquals(167, BurstBalloons.maxCoins(new int[]{3,1,5,8}));
    }
}