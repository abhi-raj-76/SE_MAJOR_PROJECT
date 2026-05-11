import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplesOfFiveCounterTest {
    @Test
    void testCount() {
        MultiplesOfFiveCounter m = new MultiplesOfFiveCounter();
        assertEquals(2, m.count(new int[]{5,7,10,11}));
    }
}