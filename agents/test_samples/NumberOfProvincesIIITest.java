import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesIIITest {
    @Test
    void testProvinces() {
        assertEquals(1, NumberOfProvincesIII.findCircleNum(new int[][]{{1}}));
    }
}