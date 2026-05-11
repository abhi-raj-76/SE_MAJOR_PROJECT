import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionSimplifierTest {
    @Test
    void testSimplify() {
        FractionSimplifier f = new FractionSimplifier();
        assertArrayEquals(new int[]{1,2}, f.simplify(4,8));
    }
}