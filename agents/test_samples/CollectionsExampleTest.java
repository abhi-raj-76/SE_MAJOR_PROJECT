Here is the JUnit 5 test class for the given Java class:

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsExampleTest {
    @Test
    void testSort() {
        // Create a list of strings
        List<String> myList = new ArrayList<>();
        myList.add("cherry");
        myList.add("banana");
        myList.add("apple");

        // Sort the list
        Collections.sort(myList);

        // Verify that the list is sorted
        assertEquals("[apple, banana, cherry]", myList.toString());
    }
}

Note that this test class only tests the sort() method of the Collections class, as that is the only method that is actually used in the main() method of the source class. The test class also includes a smoke test that verifies that the list is sorted after calling the sort() method.