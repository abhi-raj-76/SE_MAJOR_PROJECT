import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SubsetsIIVTest {
    @Test
    void testSubsets() {
        SubsetsIIV solver = new SubsetsIIV();
        List<List<Integer>> result = solver.subsetsWithDup(new int[]{1,2,2});
        assertTrue(result.size() > 0);
    }
}