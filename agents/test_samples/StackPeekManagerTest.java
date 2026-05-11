import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackPeekManagerTest {

    @Test
    void testPeek() {
        StackPeekManager s =
                new StackPeekManager();

        s.push(10);
        s.push(20);

        assertEquals(20, s.peek());
    }

    @Test
    void testSize() {
        StackPeekManager s =
                new StackPeekManager();

        s.push(1);

        assertEquals(1, s.size());
    }
}