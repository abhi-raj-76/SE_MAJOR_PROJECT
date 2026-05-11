import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenIndexAdderTest {
    @Test
    void testSum() {
        EvenIndexAdder e = new EvenIndexAdder();
        assertEquals(9, e.sum(new int[]{2,4,3,5,4}));
    }
}