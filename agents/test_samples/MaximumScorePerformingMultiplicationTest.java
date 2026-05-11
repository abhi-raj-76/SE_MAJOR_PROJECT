import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumScorePerformingMultiplicationTest {
    @Test
    void testScore() {
        assertTrue(MaximumScorePerformingMultiplication.maximumScore(new int[]{1,2}, new int[]{3}) > 0);
    }
}