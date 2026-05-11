import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    @Test
    void testQueue() {
        MyCircularQueue q = new MyCircularQueue(3);
        assertTrue(q.enQueue(1));
    }
}