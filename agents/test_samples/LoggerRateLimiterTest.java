import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoggerRateLimiterTest {
    @Test
    void testLogger() {
        LoggerRateLimiter logger = new LoggerRateLimiter();
        assertTrue(logger.shouldPrintMessage(1, "foo"));
        assertFalse(logger.shouldPrintMessage(2, "foo"));
    }
}