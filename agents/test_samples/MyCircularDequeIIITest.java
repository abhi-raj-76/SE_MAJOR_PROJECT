import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircularDequeIIITest {
    @Test
    void testDeque() {
        MyCircularDequeIII dq = new MyCircularDequeIII();
        assertFalse(dq.insertFront(1));
    }
}