public class BinaryConverterTool {
    public String convert(int n) {
        StringBuilder sb =
                new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        return sb.toString();
    }
}