import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InfiniteCounterLoopTest {
    @Test
    void testCount() {
        InfiniteCounterLoop i =
                new InfiniteCounterLoop();

        assertTimeoutPreemptively(
                java.time.Duration.ofMillis(100),
                () -> i.count()
        );
    }
}