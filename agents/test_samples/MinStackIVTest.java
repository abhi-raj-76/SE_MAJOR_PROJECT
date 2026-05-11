import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackIVTest {
    @Test
    void testMinStack() {
        MinStackIV ms = new MinStackIV();
        ms.push(-2);
        assertEquals(-2, ms.getMin());
    }
}