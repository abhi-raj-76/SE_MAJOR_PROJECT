import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesIVTest {
    @Test
    void testProvinces() {
        assertEquals(1, NumberOfProvincesIV.findCircleNum(new int[][]{{1}}));
    }
}