public class DecimalToOctalConverter {
    public String convert(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 8);
            n /= 8;
        }
        return sb.toString(); // BUG: reverse missing
    }
}