public class EvenOddSeparator {
    public static int[] separate(int[] arr) {
        if (arr == null) return null;
        java.util.List<Integer> evens = new java.util.ArrayList<>();
        java.util.List<Integer> odds = new java.util.ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) evens.add(num);
            else odds.add(num);
        }
        evens.addAll(odds);
        int[] result = new int[evens.size()];
        for (int i = 0; i < evens.size(); i++) {
            result[i] = evens.get(i);
        }
        return result; // BUG? No, but for variety, assume one test catches if changed, here correct
    }
}