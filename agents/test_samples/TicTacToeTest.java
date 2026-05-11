import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    void testTicTacToe() {
        TicTacToe t = new TicTacToe(3);
        assertEquals(0, t.move(0, 0, 1));
    }
}