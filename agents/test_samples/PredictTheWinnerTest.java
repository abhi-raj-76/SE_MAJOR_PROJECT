import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PredictTheWinnerTest {
    @Test
    void testPredict() {
        assertFalse(PredictTheWinner.predictTheWinner(new int[]{1,5,2}));
    }
}