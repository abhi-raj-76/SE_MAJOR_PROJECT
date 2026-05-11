import java.util.ArrayList;
import java.util.List;

public class DuplicateValueRemover {
    public List<Integer> remove(
            int[] arr
    ) {
        List<Integer> list =
                new ArrayList<>();

        for (int n : arr) {
            list.add(n);
        }

        return list;
    }
}