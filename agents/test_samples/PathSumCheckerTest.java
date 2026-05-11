import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PathSumCheckerTest {
    @Test
    void testPathSum() {
        assertFalse(PathSumChecker.hasPathSum(null, 0));
    }
}