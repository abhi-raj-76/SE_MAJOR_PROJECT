import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoggerRateLimiterIVTest {
    @Test
    void testLogger() {
        LoggerRateLimiterIV logger = new LoggerRateLimiterIV();
        assertTrue(logger.shouldPrintMessage(1, "foo"));
    }
}