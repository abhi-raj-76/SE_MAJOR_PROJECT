import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeIVTest {
    @Test
    void testDelay() {
        assertEquals(0, NetworkDelayTimeIV.networkDelayTime(new int[][]{}, 1, 1));
    }
}