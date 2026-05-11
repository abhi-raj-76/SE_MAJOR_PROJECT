import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackOverflowRecursionTest {
    @Test
    void testRecursion() {
        StackOverflowRecursion s =
                new StackOverflowRecursion();

        assertThrows(
                StackOverflowError.class,
                () -> s.recurse(1)
        );
    }
}