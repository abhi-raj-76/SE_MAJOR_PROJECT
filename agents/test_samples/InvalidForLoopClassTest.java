import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidForLoopClassTest {
    @Test
    void testLoop() {
        InvalidForLoopClass i =
                new InvalidForLoopClass();

        i.loop();
    }
}