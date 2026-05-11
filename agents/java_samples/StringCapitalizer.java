public class StringCapitalizer {
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(2));  // BUG: substring(2) skips second char
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}