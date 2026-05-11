import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixPathCounterTest {
    @Test
    void testUniquePaths() {
        MatrixPathCounter m =
                new MatrixPathCounter();

        assertEquals(28, m.paths(3,7));
    }
}