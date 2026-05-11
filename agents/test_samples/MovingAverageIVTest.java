import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovingAverageIVTest {
    @Test
    void testAverage() {
        MovingAverageIV ma = new MovingAverageIV(3);
        assertEquals(1.0, ma.next(1));
    }
}