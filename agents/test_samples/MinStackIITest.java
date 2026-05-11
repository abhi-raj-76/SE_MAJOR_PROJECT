import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackIITest {
    @Test
    void testMinStack() {
        MinStackII ms = new MinStackII();
        ms.push(-2);
        assertEquals(-2, ms.getMin());
    }
}