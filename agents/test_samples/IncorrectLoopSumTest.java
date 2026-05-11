import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectLoopSumTest {

    @Test
    void testSum() {
        IncorrectLoopSum i =
                new IncorrectLoopSum();

        assertEquals(15, i.sum(5));
    }

    @Test
    void testOne() {
        IncorrectLoopSum i =
                new IncorrectLoopSum();

        assertEquals(1, i.sum(1));
    }
}