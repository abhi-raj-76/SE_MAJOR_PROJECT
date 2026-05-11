import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsVTest {
    @Test
    void testGroup() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        assertEquals(3, GroupAnagramsV.groupAnagrams(input).size()); // fails
    }
}