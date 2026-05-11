import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataStreamAsDisjointIntervalsIITest {
    @Test
    void testIntervals() {
        DataStreamAsDisjointIntervalsII ds = new DataStreamAsDisjointIntervalsII();
        ds.addNum(1);
        assertEquals(0, ds.getIntervals().size());
    }
}