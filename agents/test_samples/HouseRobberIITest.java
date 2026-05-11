import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIITest {
    @Test
    void testRob() {
        assertEquals(3, HouseRobberII.rob(new int[]{2,3,2}));
    }
}