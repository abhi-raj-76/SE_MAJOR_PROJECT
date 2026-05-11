public class CircularStringShift {
    public String shift(
            String s,
            int k
    ) {
        if (s.isEmpty()) {
            return s;
        }

        k = k % s.length();

        return s.substring(
                s.length() - k
        ) + s.substring(
                0,
                s.length() - k
        );
    }
}