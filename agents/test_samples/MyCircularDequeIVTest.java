import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircularDequeIVTest {
    @Test
    void testDeque() {
        MyCircularDequeIV dq = new MyCircularDequeIV(3);
        assertTrue(dq.insertLast(1));
    }
}