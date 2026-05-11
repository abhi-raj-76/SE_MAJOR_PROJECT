import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingSemicolonProgramTest {
    @Test
    void testMultiply() {
        MissingSemicolonProgram m =
                new MissingSemicolonProgram();

        assertEquals(12, m.multiply(3,4));
    }

    @Test
    void testZero() {
        MissingSemicolonProgram m =
                new MissingSemicolonProgram();

        assertEquals(0, m.multiply(0,5));
    }

    @Test
    void testNegative() {
        MissingSemicolonProgram m =
                new MissingSemicolonProgram();

        assertEquals(-6, m.multiply(-2,3));
    }
}