import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableGeneratorTest {
    @Test
    void testTable() {
        MultiplicationTableGenerator m = new MultiplicationTableGenerator();
        assertEquals(15, m.table(3)[4]);
    }
}