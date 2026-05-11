import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeIITest {
    @Test
    void testDelay() {
        assertEquals(-1, NetworkDelayTimeII.networkDelayTime(new int[][]{{1,2,1}}, 2, 1));
    }
}