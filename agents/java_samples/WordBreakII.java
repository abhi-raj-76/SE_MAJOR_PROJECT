public class WordBreakII {
    public static java.util.List<String> wordBreak(String s, java.util.List<String> wordDict) {
        java.util.List<String> result = new java.util.ArrayList<>();
        backtrack(s, 0, wordDict, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(String s, int start, java.util.List<String> dict, StringBuilder path, java.util.List<String> result) {
        if (start == s.length()) {
            result.add(path.toString().trim());
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (dict.contains(word)) {
                int len = path.length();
                path.append(word).append(" ");
                backtrack(s, end, dict, path, result);
                path.setLength(len);
            }
        }
    }
}