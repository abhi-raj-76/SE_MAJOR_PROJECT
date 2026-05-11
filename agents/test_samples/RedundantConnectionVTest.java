import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionVTest {
    @Test
    void testRedundant() {
        assertArrayEquals(new int[]{0,0}, RedundantConnectionV.findRedundantConnection(new int[][]{{1,2}}));
    }
}