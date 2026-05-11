import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class FindAllAnagramsInStringVITest {
    @Test
    void testAnagrams() {
        FindAllAnagramsInStringVI solver = new FindAllAnagramsInStringVI();
        List<Integer> result = solver.findAnagrams("cbaebabacd", "abc");
        assertTrue(result.contains(0));
        assertTrue(result.contains(6));
    }
}