import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignFrontMiddleBackQueueTest {
    @Test
    void testQueue() {
        DesignFrontMiddleBackQueue q = new DesignFrontMiddleBackQueue();
        q.pushFront(1);
        assertEquals(-1, q.popFront());
    }
}