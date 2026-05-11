import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {
    @Test
    void testGuess() {
        assertEquals(1, GuessNumberHigherOrLower.guessNumber(1));
    }
}