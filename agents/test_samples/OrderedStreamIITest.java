import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderedStreamIITest {
    @Test
    void testStream() {
        OrderedStreamII os = new OrderedStreamII(5);
        assertEquals(0, os.insert(3, "cc").size());
    }
}