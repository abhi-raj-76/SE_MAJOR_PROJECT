import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeVTest {
    @Test
    void testDelay() {
        assertEquals(0, NetworkDelayTimeV.networkDelayTime(new int[][]{}, 1, 1));
    }
}