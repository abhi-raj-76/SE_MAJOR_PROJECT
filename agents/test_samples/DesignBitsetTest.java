import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignBitsetTest {
    @Test
    void testBitset() {
        DesignBitset bs = new DesignBitset(5);
        bs.fix(0);
        assertTrue(bs.one());
    }
}