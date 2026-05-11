import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsIITest {
    @Test
    void testPing() {
        NumberOfRecentCallsII calls = new NumberOfRecentCallsII();
        assertEquals(1, calls.ping(1));
    }
}