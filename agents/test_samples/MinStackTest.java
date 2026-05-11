import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    @Test
    void testMinStack() {
        MinStack ms = new MinStack();
        ms.push(-2); ms.push(0); ms.push(-3);
        assertEquals(-3, ms.getMin());
    }
}