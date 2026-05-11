public class CountVowelSubstrings {
    public static int countVowels(String s) {
        if (s == null || s.isEmpty()) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}