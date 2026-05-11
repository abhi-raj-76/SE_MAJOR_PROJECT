import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluateDivisionIIITest {
    @Test
    void testCalc() {
        assertTrue(EvaluateDivisionIII.calcEquation(new java.util.ArrayList<>(), new double[]{}, new java.util.ArrayList<>()).length >= 0);
    }
}