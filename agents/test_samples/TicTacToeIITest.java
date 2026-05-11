import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeIITest {
    @Test
    void testTicTacToe() {
        TicTacToeII t = new TicTacToeII(3);
        assertEquals(0, t.move(0, 0, 1));
    }
}