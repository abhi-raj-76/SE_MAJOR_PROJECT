import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongVariableTrackerTest {
    @Test
    void testTotal() {
        WrongVariableTracker w =
                new WrongVariableTracker();

        assertEquals(
                6,
                w.total(new int[]{1,2,3})
        );
    }

    @Test
    void testSingle() {
        WrongVariableTracker w =
                new WrongVariableTracker();

        assertEquals(
                5,
                w.total(new int[]{5})
        );
    }

    @Test
    void testEmpty() {
        WrongVariableTracker w =
                new WrongVariableTracker();

        assertEquals(
                0,
                w.total(new int[]{})
        );
    }
}