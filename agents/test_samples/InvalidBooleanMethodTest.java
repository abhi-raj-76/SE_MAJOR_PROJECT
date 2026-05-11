import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidBooleanMethodTest {
    @Test
    void testCheck() {
        InvalidBooleanMethod i =
                new InvalidBooleanMethod();

        assertTrue(i.check(5));
    }
}