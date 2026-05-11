import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircularDequeIITest {
    @Test
    void testDeque() {
        MyCircularDequeII dq = new MyCircularDequeII(3);
        assertTrue(dq.insertLast(1));
    }
}