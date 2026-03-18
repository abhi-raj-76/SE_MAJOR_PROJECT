import java.util.*;

public class CollectionExample {
  public static void main(String[] args) {
    // Create a list of integers
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // Create a set of strings
    Set<String> set = new HashSet<>();
    set.add("apple");
    set.add("banana");
    set.add("cherry");

    // Create a map of integers to strings
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "apple");
    map.put(2, "banana");
    map.put(3, "cherry");

    // Iterate over the list
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    // Iterate over the set
    for (String fruit : set) {
      System.out.println(fruit);
    }

    // Iterate over the map
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}

This class demonstrates the use of three common Java collections: `List`, `Set`, and `Map`. It creates instances of each collection and uses them to store and retrieve data. It then iterates over the collections using a `for` loop to demonstrate how to access their contents.