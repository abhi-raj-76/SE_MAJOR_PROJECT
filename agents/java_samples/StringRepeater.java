public class StringRepeater {
    public String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) { // BUG
            sb.append(s);
        }
        return sb.toString();
    }
}