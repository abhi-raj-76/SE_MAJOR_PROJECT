import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoggerRateLimiterIIITest {
    @Test
    void testLogger() {
        LoggerRateLimiterIII logger = new LoggerRateLimiterIII();
        assertTrue(logger.shouldPrintMessage(1, "foo"));
    }
}