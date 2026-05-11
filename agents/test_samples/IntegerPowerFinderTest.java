import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerPowerFinderTest {
    @Test
    void testPower() {
        IntegerPowerFinder i = new IntegerPowerFinder();
        assertEquals(8, i.power(2,3));
    }
}