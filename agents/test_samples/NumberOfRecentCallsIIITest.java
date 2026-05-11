import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsIIITest {
    @Test
    void testPing() {
        NumberOfRecentCallsIII calls = new NumberOfRecentCallsIII();
        assertEquals(1, calls.ping(1)); // fails
    }
}