import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeMinCoinsTest {
    @Test
    void testCoins() {
        assertEquals(3, CoinChangeMinCoins.coinChange(new int[]{1,2,5}, 11));
    }
}