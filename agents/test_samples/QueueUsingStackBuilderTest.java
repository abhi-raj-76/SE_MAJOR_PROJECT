import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueUsingStackBuilderTest {
    @Test
    void testQueue() {
        QueueUsingStackBuilder q = new QueueUsingStackBuilder();
        q.push(1);
        q.push(2);
        assertEquals(1, q.pop());
    }
}