import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTraceCalculatorTest {
    @Test void testTrace() {
        assertEquals(5, MatrixTraceCalculator.trace(new int[][]{{1,2},{3,4}}));
        assertEquals(6, MatrixTraceCalculator.trace(new int[][]{{1,0,0},{0,2,0},{0,0,3}}));
        assertEquals(0, MatrixTraceCalculator.trace(new int[2][2]));
    }
    @Test void testSingle() {
        assertEquals(7, MatrixTraceCalculator.trace(new int[][]{{7}}));
    }
}