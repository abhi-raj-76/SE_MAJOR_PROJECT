import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignBitsetIITest {
    @Test
    void testBitset() {
        DesignBitsetII bs = new DesignBitsetII(5);
        bs.fix(0);
        assertTrue(bs.one());
    }
}