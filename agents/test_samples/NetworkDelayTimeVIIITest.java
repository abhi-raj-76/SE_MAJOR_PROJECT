import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeVIIITest {
    @Test
    void testDelay() {
        assertEquals(0, NetworkDelayTimeVIII.networkDelayTime(new int[][]{}, 1, 1));
    }
}