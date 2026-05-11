import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {
    @Test
    void testFlood() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        assertArrayEquals(image, FloodFill.floodFill(image, 1, 1, 2)); // fails
    }
}