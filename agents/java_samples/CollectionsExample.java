import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // Sort the list
        Collections.sort(myList);

        // Print the sorted list
        System.out.println(myList);
    }
}