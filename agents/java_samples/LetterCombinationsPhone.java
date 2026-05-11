public class LetterCombinationsPhone {
    public static java.util.List<String> letterCombinations(String digits) {
        java.util.List<String> result = new java.util.ArrayList<>();
        if (digits.isEmpty()) return result;
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(digits, 0, new StringBuilder(), result, mapping);
        return result;
    }

    private static void backtrack(String digits, int index, StringBuilder path, java.util.List<String> result, String[] mapping) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            path.append(c);
            backtrack(digits, index + 1, path, result, mapping);
            path.deleteCharAt(path.length() - 1);
        }
    }
}