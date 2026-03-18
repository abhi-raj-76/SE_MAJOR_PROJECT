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

    // create a set of integers
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);

    // create a map of strings to integers
    Map<String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);

    // print the list
    System.out.println(list);

    // print the set
    System.out.println(set);

    // print the map
    System.out.println(map);
  }
}

This Java class uses the `java.util` package to create and manipulate collections such as lists, sets, and maps. It demonstrates how to create and manipulate collections using the `ArrayList`, `HashSet`, and `HashMap` classes. The class also demonstrates how to print the contents of these collections using the `System.out.println()` method.