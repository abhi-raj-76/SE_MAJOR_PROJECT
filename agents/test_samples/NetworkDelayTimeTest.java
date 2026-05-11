import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeTest {
    @Test
    void testDelay() {
        assertEquals(-1, NetworkDelayTime.networkDelayTime(new int[][]{}, 1, 1));
    }
}