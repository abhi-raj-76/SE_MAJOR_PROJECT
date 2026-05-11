import java.util.Arrays;

public class StringLengthSorter {
    public String[] sort(String[] arr) {
        Arrays.sort(arr, (a,b) -> a.length() - b.length());
        return arr;
    }
}