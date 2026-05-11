import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class DuplicateValueRemoverTest {
    @Test
    void testRemoveDuplicates() {
        DuplicateValueRemover d =
                new DuplicateValueRemover();

        assertEquals(
                Arrays.asList(1,2,3),
                d.remove(new int[]{1,2,2,3})
        );
    }

    @Test
    void testUnique() {
        DuplicateValueRemover d =
                new DuplicateValueRemover();

        assertEquals(
                Arrays.asList(4,5),
                d.remove(new int[]{4,5})
        );
    }
}