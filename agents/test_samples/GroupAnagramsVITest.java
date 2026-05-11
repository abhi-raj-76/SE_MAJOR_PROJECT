import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class GroupAnagramsVITest {
    @Test
    void testGroup() {
        GroupAnagramsVI solver = new GroupAnagramsVI();
        List<List<String>> res = solver.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assertEquals(3, res.size());
    }
}