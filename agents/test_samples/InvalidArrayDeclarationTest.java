import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidArrayDeclarationTest {

    @Test
    void testTotal() {
        InvalidArrayDeclaration i =
                new InvalidArrayDeclaration();

        assertEquals(5, i.total());
    }
}