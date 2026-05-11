import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalRounderTest {
    @Test
    void testRound() {
        DecimalRounder d = new DecimalRounder();
        assertEquals(6, d.round(5.7));
    }
}