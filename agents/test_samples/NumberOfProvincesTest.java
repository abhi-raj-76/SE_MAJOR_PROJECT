import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {
    @Test
    void testProvinces() {
        assertEquals(2, NumberOfProvinces.findCircleNum(new int[][]{{1,1},{1,1}})); // fails
    }
}