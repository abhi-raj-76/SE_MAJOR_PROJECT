import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenIndexSummerTest {
    @Test
    void testEvenIndex() {
        EvenIndexSummer e = new EvenIndexSummer();
        assertEquals(9, e.sum(new int[]{1,2,3,4,5}));
    }
}