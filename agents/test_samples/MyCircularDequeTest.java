import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircularDequeTest {
    @Test
    void testDeque() {
        MyCircularDeque dq = new MyCircularDeque();
        assertFalse(dq.insertFront(1));
    }
}