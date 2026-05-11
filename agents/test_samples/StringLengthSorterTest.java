import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringLengthSorterTest {
    @Test
    void testSort() {
        StringLengthSorter s = new StringLengthSorter();
        assertEquals("a", s.sort(new String[]{"hello","a","cat"})[0]);
    }
}