import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsIVTest {
    @Test
    void testPing() {
        NumberOfRecentCallsIV calls = new NumberOfRecentCallsIV();
        assertEquals(1, calls.ping(1));
    }
}