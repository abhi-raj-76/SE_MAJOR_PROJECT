import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesIITest {
    @Test
    void testProvinces() {
        assertEquals(1, NumberOfProvincesII.findCircleNum(new int[][]{{1}}));
    }
}