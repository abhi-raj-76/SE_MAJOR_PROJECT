import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackWithGetMinTest {
    @Test
    void testMinStack() {
        MinStackWithGetMin ms = new MinStackWithGetMin();
        ms.push(-2); ms.push(0); ms.push(-3);
        assertEquals(-3, ms.getMin());
    }
}