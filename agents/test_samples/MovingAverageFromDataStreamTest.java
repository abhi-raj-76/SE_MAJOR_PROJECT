import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovingAverageFromDataStreamTest {
    @Test
    void testAverage() {
        MovingAverageFromDataStream ma = new MovingAverageFromDataStream(3);
        assertEquals(1.0, ma.next(1));
    }
}