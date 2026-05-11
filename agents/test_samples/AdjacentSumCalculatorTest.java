import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdjacentSumCalculatorTest {
    @Test
    void testAdjacentSum() {
        AdjacentSumCalculator a = new AdjacentSumCalculator();
        assertArrayEquals(new int[]{3,5}, a.sums(new int[]{1,2,3}));
    }
}