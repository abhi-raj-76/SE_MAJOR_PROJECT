import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidIfConditionTest {
    @Test
    void testCheck() {
        InvalidIfCondition i =
                new InvalidIfCondition();

        assertTrue(i.check(5));
    }
}