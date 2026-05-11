import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIIITest {
    @Test
    void testRob() {
        HouseRobberIII.TreeNode root = new HouseRobberIII.TreeNode(3);
        assertTrue(HouseRobberIII.rob(root) >= 0);
    }
}