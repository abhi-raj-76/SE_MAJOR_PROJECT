import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumericStringValidatorTest {
    @Test
    void testNumeric() {
        NumericStringValidator n = new NumericStringValidator();
        assertTrue(n.numeric("12345"));
    }
}