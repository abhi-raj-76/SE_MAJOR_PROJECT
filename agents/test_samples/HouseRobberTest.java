import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {
    @Test
    void testRob() {
        assertEquals(4, HouseRobber.rob(new int[]{1,2,3,1}));
    }
}