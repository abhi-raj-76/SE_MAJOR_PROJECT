import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class EvenNumberFilterTest {

    @Test
    void testEvenFilter() {
        EvenNumberFilter e =
                new EvenNumberFilter();

        List<Integer> result =
                e.filter(new int[]{1,2,3,4,6});

        assertEquals(3, result.size());
    }

    @Test
    void testSingleEven() {
        EvenNumberFilter e =
                new EvenNumberFilter();

        List<Integer> result =
                e.filter(new int[]{8});

        assertEquals(8, result.get(0));
    }
}