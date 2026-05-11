import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorCounterTest {
    @Test
    void testFactors() {
        FactorCounter f = new FactorCounter();
        assertEquals(6, f.count(12));
    }
}