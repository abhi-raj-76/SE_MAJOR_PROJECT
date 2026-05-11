public class InitialExtractor {
    public String extract(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w.charAt(0));
        }
        return sb.toString();
    }
}