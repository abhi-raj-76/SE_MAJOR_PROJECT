import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // print the list
        System.out.println(list);

        // create a set of integers
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // print the set
        System.out.println(set);
    }
}

This code creates two collections: a list and a set of integers. The list is an ordered collection, while the set is an unordered collection with unique elements. The code adds five elements to both collections using the `add()` method, and then prints them using the `println()` method.