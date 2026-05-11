import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackIIITest {
    @Test
    void testMinStack() {
        MinStackIII ms = new MinStackIII();
        ms.push(-2);
        assertEquals(-2, ms.getMin());
    }
}