import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsIIITest {
    @Test
    void testGroup() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        assertEquals(3, GroupAnagramsIII.groupAnagrams(input).size()); // fails
    }
}