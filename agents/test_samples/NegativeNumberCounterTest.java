import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NegativeNumberCounterTest {
    @Test
    void testCount() {
        NegativeNumberCounter n = new NegativeNumberCounter();
        assertEquals(2, n.count(new int[]{-1,2,-3,4}));
    }
}