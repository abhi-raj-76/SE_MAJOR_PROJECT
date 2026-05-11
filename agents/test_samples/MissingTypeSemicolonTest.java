import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingTypeSemicolonTest {
    @Test
    void testSquare() {
        MissingTypeSemicolon m =
                new MissingTypeSemicolon();

        assertEquals(16, m.square(4));
    }

    @Test
    void testZero() {
        MissingTypeSemicolon m =
                new MissingTypeSemicolon();

        assertEquals(0, m.square(0));
    }

    @Test
    void testNegative() {
        MissingTypeSemicolon m =
                new MissingTypeSemicolon();

        assertEquals(9, m.square(-3));
    }
}