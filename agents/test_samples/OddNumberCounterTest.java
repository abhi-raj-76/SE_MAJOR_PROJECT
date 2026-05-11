import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OddNumberCounterTest {
    @Test
    void testCount() {
        OddNumberCounter o = new OddNumberCounter();
        assertEquals(3, o.count(new int[]{1,2,3,5}));
    }
}