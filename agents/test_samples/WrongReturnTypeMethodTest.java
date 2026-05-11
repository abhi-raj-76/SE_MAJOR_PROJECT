import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongReturnTypeMethodTest {
    @Test
    void testName() {
        WrongReturnTypeMethod w =
                new WrongReturnTypeMethod();

        assertEquals(
                "John",
                w.getName()
        );
    }
}