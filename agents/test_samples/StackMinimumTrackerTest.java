import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackMinimumTrackerTest {
    @Test
    void testMinimum() {
        StackMinimumTracker s =
                new StackMinimumTracker();

        s.push(5);
        s.push(2);
        s.push(7);

        assertEquals(2, s.getMin());
    }

    @Test
    void testPopMin() {
        StackMinimumTracker s =
                new StackMinimumTracker();

        s.push(3);
        s.push(1);
        s.pop();

        assertEquals(3, s.getMin());
    }

    @Test
    void testSingle() {
        StackMinimumTracker s =
                new StackMinimumTracker();

        s.push(9);

        assertEquals(9, s.getMin());
    }
}