import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovingAverageIIITest {
    @Test
    void testAverage() {
        MovingAverageIII ma = new MovingAverageIII(3);
        assertEquals(1.0, ma.next(1));
    }
}