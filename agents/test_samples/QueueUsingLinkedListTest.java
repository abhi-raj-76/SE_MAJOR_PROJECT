import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueUsingLinkedListTest {
    @Test
    void testQueue() {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        assertEquals(10, q.dequeue());
        assertEquals(20, q.dequeue());
    }
}