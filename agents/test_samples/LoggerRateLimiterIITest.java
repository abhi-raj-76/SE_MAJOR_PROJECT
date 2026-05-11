import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoggerRateLimiterIITest {
    @Test
    void testLogger() {
        LoggerRateLimiterII logger = new LoggerRateLimiterII();
        assertTrue(logger.shouldPrintMessage(1, "foo"));
    }
}