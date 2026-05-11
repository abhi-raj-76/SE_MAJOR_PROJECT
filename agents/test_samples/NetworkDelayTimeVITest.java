import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeVITest {
    @Test
    void testDelay() {
        assertEquals(0, NetworkDelayTimeVI.networkDelayTime(new int[][]{}, 1, 1));
    }
}