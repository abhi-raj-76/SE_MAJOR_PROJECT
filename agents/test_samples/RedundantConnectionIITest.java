import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionIITest {
    @Test
    void testRedundant() {
        assertArrayEquals(new int[]{0,0}, RedundantConnectionII.findRedundantDirectedConnection(new int[][]{}));
    }
}