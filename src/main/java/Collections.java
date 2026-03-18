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