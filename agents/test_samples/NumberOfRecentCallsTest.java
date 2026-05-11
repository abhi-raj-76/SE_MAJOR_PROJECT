import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsTest {
    @Test
    void testPing() {
        NumberOfRecentCalls calls = new NumberOfRecentCalls();
        assertEquals(1, calls.ping(1));
    }
}