import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingSemicolonClassTest {
    @Test
    void testAdd() {
        assertEquals(
                5,
                MissingSemicolonClass.add(2,3)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                7,
                MissingSemicolonClass.add(7,0)
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -2,
                MissingSemicolonClass.add(-1,-1)
        );
    }
}