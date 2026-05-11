import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    void testGroup() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        assertEquals(3, GroupAnagrams.group(input).size());
    }
}