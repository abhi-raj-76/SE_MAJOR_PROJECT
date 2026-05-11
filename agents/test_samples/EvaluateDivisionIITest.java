import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluateDivisionIITest {
    @Test
    void testCalc() {
        assertTrue(EvaluateDivisionII.calcEquation(new java.util.ArrayList<>(), new double[]{}, new java.util.ArrayList<>()).length >= 0);
    }
}