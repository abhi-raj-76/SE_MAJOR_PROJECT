import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenNumberCounterTest {
    @Test
    void testCount() {
        EvenNumberCounter c = new EvenNumberCounter();
        assertEquals(3, c.count(new int[]{1,2,4,5,6}));
    }
}