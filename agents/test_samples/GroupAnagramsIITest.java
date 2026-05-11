import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsIITest {
    @Test
    void testGroup() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        assertEquals(3, GroupAnagramsII.groupAnagrams(input).size()); // fails
    }
}