import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidVariableDeclarationTest {
    @Test
    void testAdd() {
        assertEquals(
                5,
                InvalidVariableDeclaration.add()
        );
    }

    @Test
    void testAgain() {
        assertTrue(
                InvalidVariableDeclaration.add() > 0
        );
    }

    @Test
    void testNotZero() {
        assertNotEquals(
                0,
                InvalidVariableDeclaration.add()
        );
    }
}