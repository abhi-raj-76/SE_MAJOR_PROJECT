import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerDigitAdderTest {
    @Test
    void testAddDigits() {
        IntegerDigitAdder i = new IntegerDigitAdder();
        assertEquals(6, i.addDigits(123));
    }
}