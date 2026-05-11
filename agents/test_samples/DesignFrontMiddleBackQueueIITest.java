import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignFrontMiddleBackQueueIITest {
    @Test
    void testQueue() {
        DesignFrontMiddleBackQueueII q = new DesignFrontMiddleBackQueueII();
        q.pushFront(1);
        assertEquals(-1, q.popFront());
    }
}