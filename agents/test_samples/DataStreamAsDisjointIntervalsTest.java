import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataStreamAsDisjointIntervalsTest {
    @Test
    void testIntervals() {
        DataStreamAsDisjointIntervals ds = new DataStreamAsDisjointIntervals();
        ds.addNum(1);
        assertEquals(0, ds.getIntervals().size());
    }
}