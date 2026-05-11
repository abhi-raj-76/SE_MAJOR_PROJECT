import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbersTest {
    @Test
    void testSum() {
        SumRootToLeafNumbers.TreeNode root = new SumRootToLeafNumbers.TreeNode(1);
        assertEquals(1, SumRootToLeafNumbers.sumNumbers(root)); // fails
    }
}