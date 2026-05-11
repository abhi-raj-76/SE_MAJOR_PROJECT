import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueStackSimulatorTest {

    @Test
    void testPushPop() {
        QueueStackSimulator q =
                new QueueStackSimulator();

        q.push(1);
        q.push(2);

        assertEquals(2, q.pop());
    }

    @Test
    void testTop() {
        QueueStackSimulator q =
                new QueueStackSimulator();

        q.push(7);

        assertEquals(7, q.top());
    }
}