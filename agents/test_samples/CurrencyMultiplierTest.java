import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyMultiplierTest {
    @Test
    void testMultiply() {
        CurrencyMultiplier c = new CurrencyMultiplier();
        assertEquals(15.0, c.multiply(3,5));
    }
}