import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeIIITest {
    @Test
    void testDelay() {
        assertEquals(0, NetworkDelayTimeIII.networkDelayTime(new int[][]{}, 1, 1));
    }
}