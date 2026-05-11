import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BurstBalloonsVITest {
    @Test
    void testCoins() {
        BurstBalloonsVI solver = new BurstBalloonsVI();
        assertEquals(167, solver.maxCoins(new int[]{3,1,5,8}));
    }
}