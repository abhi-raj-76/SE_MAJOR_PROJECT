import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberVTest {
    @Test
    void testRob() {
        assertEquals(0, HouseRobberV.rob(new int[]{}));
    }
}