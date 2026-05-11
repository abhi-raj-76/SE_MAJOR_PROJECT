import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidBooleanReturnTest {
    @Test
    void testValid() {
        InvalidBooleanReturn i =
                new InvalidBooleanReturn();

        assertTrue(i.valid());
    }

    @Test
    void testAgain() {
        InvalidBooleanReturn i =
                new InvalidBooleanReturn();

        assertTrue(i.valid());
    }

    @Test
    void testThird() {
        InvalidBooleanReturn i =
                new InvalidBooleanReturn();

        assertTrue(i.valid());
    }
}