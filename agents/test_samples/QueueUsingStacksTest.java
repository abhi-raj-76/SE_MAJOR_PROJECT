import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueUsingStacksTest {
    @Test
    void testPushPop() {
        QueueUsingStacks q =
                new QueueUsingStacks();

        q.push(10);
        q.push(20);

        assertEquals(10, q.pop());
    }

    @Test
    void testPeek() {
        QueueUsingStacks q =
                new QueueUsingStacks();

        q.push(5);

        assertEquals(5, q.peek());
    }

    @Test
    void testOrder() {
        QueueUsingStacks q =
                new QueueUsingStacks();

        q.push(1);
        q.push(2);
        q.push(3);

        q.pop();

        assertEquals(2, q.peek());
    }
}