import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignAddAndSearchWordsDataStructureTest {
    @Test
    void testWordDictionary() {
        DesignAddAndSearchWordsDataStructure dict = new DesignAddAndSearchWordsDataStructure();
        dict.addWord("bad");
        assertTrue(dict.search("bad"));
    }
}