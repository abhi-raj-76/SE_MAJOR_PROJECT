import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionIVTest {
    @Test
    void testRedundant() {
        assertArrayEquals(new int[]{0,0}, RedundantConnectionIV.findRedundantConnection(new int[][]{{1,2}}));
    }
}