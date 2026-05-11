import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionIIITest {
    @Test
    void testRedundant() {
        assertArrayEquals(new int[]{0,0}, RedundantConnectionIII.findRedundantConnection(new int[][]{{1,2}}));
    }
}