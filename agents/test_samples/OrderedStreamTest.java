import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderedStreamTest {
    @Test
    void testStream() {
        OrderedStream os = new OrderedStream(5);
        assertEquals(0, os.insert(3, "cc").size());
    }
}