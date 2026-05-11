import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularQueueManagerTest {
    @Test
    void testQueueInsertRemove() {
        CircularQueueManager q =
                new CircularQueueManager(3);

        q.enqueue(10);
        q.enqueue(20);

        assertEquals(10, q.dequeue());
    }

    @Test
    void testQueueOverflow() {
        CircularQueueManager q =
                new CircularQueueManager(1);

        q.enqueue(1);

        assertFalse(q.enqueue(2));
    }

    @Test
    void testEmptyQueue() {
        CircularQueueManager q =
                new CircularQueueManager(2);

        assertEquals(-1, q.dequeue());
    }
}