import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {
    @Test
    void testFirstBad() {
        assertEquals(4, FirstBadVersion.firstBadVersion(5)); // fails
    }
}