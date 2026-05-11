import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackOverflowLooperTest {
    @Test
    void testLoop() {
        StackOverflowLooper s =
                new StackOverflowLooper();

        assertThrows(
                StackOverflowError.class,
                () -> s.loop()
        );
    }

    @Test
    void testAgain() {
        StackOverflowLooper s =
                new StackOverflowLooper();

        assertThrows(
                StackOverflowError.class,
                () -> s.loop()
        );
    }

    @Test
    void testThird() {
        StackOverflowLooper s =
                new StackOverflowLooper();

        assertThrows(
                StackOverflowError.class,
                () -> s.loop()
        );
    }
}