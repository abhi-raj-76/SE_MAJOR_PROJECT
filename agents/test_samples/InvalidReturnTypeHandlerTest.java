import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidReturnTypeHandlerTest {
    @Test
    void testMessage() {
        assertEquals(
                "hello",
                InvalidReturnTypeHandler.message()
        );
    }

    @Test
    void testNotNull() {
        assertNotNull(
                InvalidReturnTypeHandler.message()
        );
    }

    @Test
    void testValue() {
        assertTrue(
                InvalidReturnTypeHandler.message()
                        .length() > 0
        );
    }
}