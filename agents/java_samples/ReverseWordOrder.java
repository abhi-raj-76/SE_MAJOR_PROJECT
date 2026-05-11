public class ReverseWordOrder {
    public String reverse(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) { // BUG
            sb.append(parts[i]).append(" ");
        }
        return sb.toString().trim();
    }
}