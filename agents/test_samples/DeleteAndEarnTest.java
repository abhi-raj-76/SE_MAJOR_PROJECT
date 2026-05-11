import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeleteAndEarnTest {
    @Test
    void testEarn() {
        assertTrue(DeleteAndEarn.deleteAndEarn(new int[]{3,4,2}) > 0);
    }
}