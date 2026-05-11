import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueIITest {
    @Test
    void testQueue() {
        MyCircularQueueII q = new MyCircularQueueII(3);
        assertTrue(q.enQueue(1));
    }
}