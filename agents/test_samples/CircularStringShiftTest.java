import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularStringShiftTest {
    @Test
    void testShift() {
        CircularStringShift c =
                new CircularStringShift();

        assertEquals(
                "deabc",
                c.shift("abcde",2)
        );
    }

    @Test
    void testZero() {
        CircularStringShift c =
                new CircularStringShift();

        assertEquals(
                "abc",
                c.shift("abc",0)
        );
    }
}