import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProfitableSchemesIITest {
    @Test
    void testSchemes() {
        assertEquals(0, ProfitableSchemesII.profitableSchemes(5, 3, new int[]{2,2}, new int[]{2,3}));
    }
}