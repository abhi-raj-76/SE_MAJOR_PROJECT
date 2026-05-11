import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OddNumberSummationTest {
    @Test
    void testSum() {
        OddNumberSummation o = new OddNumberSummation();
        assertEquals(25, o.sumOdd(9));
    }
}