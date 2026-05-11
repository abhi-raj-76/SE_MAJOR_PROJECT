import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsIITest {
    @Test
    void testIslands() {
        assertEquals(3, NumberOfIslandsII.numIslands2(3, 3, new int[][]{{0,0},{0,1},{1,2}}).size());
    }
}