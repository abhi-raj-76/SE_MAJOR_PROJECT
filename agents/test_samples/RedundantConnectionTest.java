import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionTest {
    @Test
    void testRedundant() {
        int[][] edges = {{1,2},{1,3},{2,3}};
        assertArrayEquals(new int[]{2,3}, RedundantConnection.findRedundantConnection(edges));
    }
}