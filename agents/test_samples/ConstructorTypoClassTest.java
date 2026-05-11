import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConstructorTypoClassTest {

    @Test
    void testAddition() {
        ConstructorTypoClass c =
                new ConstructorTypoClass();

        assertEquals(9, c.add(4,5));
    }
}