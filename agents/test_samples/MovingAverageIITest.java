import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovingAverageIITest {
    @Test
    void testAverage() {
        MovingAverageII ma = new MovingAverageII(3);
        assertEquals(1.0, ma.next(1));
        assertEquals(5.5, ma.next(10));
    }
}