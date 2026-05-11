import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DominoTrominoTilingTest {
    @Test
    void testTilings() {
        assertEquals(1, DominoTrominoTiling.numTilings(1));
    }
}